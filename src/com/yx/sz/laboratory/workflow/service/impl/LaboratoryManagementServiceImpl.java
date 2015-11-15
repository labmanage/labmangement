package com.yx.sz.laboratory.workflow.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipInputStream;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.form.TaskFormData;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.identity.Authentication;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ExecutionEntityManager;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.apache.commons.lang.StringUtils;

import cn.itcast.ssh.utils.Constants;
import cn.itcast.ssh.utils.SessionContext;
import cn.itcast.ssh.web.form.WorkflowBean;

import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.proStandLibrary.bean.HistoryComment;
import com.yx.sz.laboratory.proStandLibrary.bean.SubProcessHistory;
import com.yx.sz.laboratory.proStandLibrary.service.CheckReportService;
import com.yx.sz.laboratory.proStandLibrary.service.FoodParametersEquipmentService;
import com.yx.sz.laboratory.proStandLibrary.service.SubProcessHistoryService;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.dao.IFoodParamAndEquipmentDao;
import com.yx.sz.laboratory.workflow.bean.AbstractSampleList;
import com.yx.sz.laboratory.workflow.bean.CattleSampleList;
import com.yx.sz.laboratory.workflow.bean.ForestFoodSampleList;
import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;
import com.yx.sz.laboratory.workflow.bean.QualitySampleList;
import com.yx.sz.laboratory.workflow.bean.SampleList;
import com.yx.sz.laboratory.workflow.dao.ICattleSampleListDao;
import com.yx.sz.laboratory.workflow.dao.IForestFoodSampleListDao;
import com.yx.sz.laboratory.workflow.dao.IPollutionFreeSampleListDao;
import com.yx.sz.laboratory.workflow.dao.IQualitySampleListDao;
import com.yx.sz.laboratory.workflow.dao.ISampleListDao;
import com.yx.sz.laboratory.workflow.service.ILaboratoryManagementService;
public class LaboratoryManagementServiceImpl implements
		ILaboratoryManagementService {

	/**抽样单申请Dao*/
	private ISampleListDao sampleListDao;
	
	private RepositoryService repositoryService;
	
	private RuntimeService runtimeService;
	
	private TaskService taskService;
	
	private FormService formService;
	
	private HistoryService historyService;
	
	private HistoryService managementService;
	
	private CheckReportService checkReportService;
	
	private FoodParametersEquipmentService foodParametersEquipmentService;
	
	private SubProcessHistoryService subProcessHistoryService;
	
	private IPollutionFreeSampleListDao pollutionFreeDao;
	private IQualitySampleListDao qualityDao;
	private IForestFoodSampleListDao forestDao;
	private ICattleSampleListDao cattleDao;
	
	private IFoodParamAndEquipmentDao fpeDao;
	
	public  void t(){
		CommandContext cmmContext = Context.getCommandContext();  
		ExecutionEntityManager exeEntityManager = cmmContext.getExecutionEntityManager();  
		exeEntityManager.findChildExecutionsByProcessInstanceId("").size();
		

		
	}
	
	

	public void setHistoryService(HistoryService historyService) {
		this.historyService = historyService;
	}
	
	public void setFormService(FormService formService) {
		this.formService = formService;
	}
	
	public void setRuntimeService(RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	public void setRepositoryService(RepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}

	/**部署流程定义*/
	@Override
	public void saveNewDeploye(File file, String filename) {
		try {
			//2：将File类型的文件转化成ZipInputStream流
			ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
			repositoryService.createDeployment()//创建部署对象
							.name(filename)//添加部署名称
							.addZipInputStream(zipInputStream)//
							.deploy();//完成部署
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**查询部署对象信息，对应表（act_re_deployment）*/
	@Override
	public List<Deployment> findDeploymentList() {
		List<Deployment> list = repositoryService.createDeploymentQuery()//创建部署对象查询
							.orderByDeploymenTime().asc()//
							.list();
		return list;
	}
	
	/**查询流程定义的信息，对应表（act_re_procdef）*/
	@Override
	public List<ProcessDefinition> findProcessDefinitionList() {
		List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery()//创建流程定义查询
							.orderByProcessDefinitionVersion().asc()//
							.list();
		return list;
	}
	
	/**使用部署对象ID和资源图片名称，获取图片的输入流*/
	@Override
	public InputStream findImageInputStream(String deploymentId,
			String imageName) {
		return repositoryService.getResourceAsStream(deploymentId, imageName);
	}
	
	/**使用部署对象ID，删除流程定义*/
	@Override
	public void deleteProcessDefinitionByDeploymentId(String deploymentId) {
		repositoryService.deleteDeployment(deploymentId, true);
	}
	
	@Override
	public void saveStartProcessById(WorkflowBean workflowBean) throws Exception {
		//1：获取抽样单ID，使用抽样单ID，查询请对应的抽样单
		Long id = workflowBean.getId();
		String className = "";
		//更新抽样单的状态从0变成1（初始录入-->审核中）
		switch(workflowBean.getProcessType()){
			case Constants.PROCESS_TYPE_SAMPLE_LIST:
				className = "SampleList";
				SampleList sampleList = sampleListDao.findSampleListById(id);
				sampleList.setState(1);
				break;
			case Constants.PROCESS_TYPE_CATTLE_SAMPLE_LIST:
				CattleSampleList csampleList = cattleDao.getById(id);
				csampleList.setState(1);
				className = "CattleSampleList";
				break;
			case Constants.PROCESS_TYPE_FOREST_LIST:
				ForestFoodSampleList fsampleList = forestDao.getById(id);
				fsampleList.setState(1);
				className = "ForestFoodSampleList";
				break;
			case Constants.PROCESS_TYPE_QUALITY_LIST:
				QualitySampleList qsampleList = qualityDao.getById(id);
				qsampleList.setState(1);
				className = "QualitySampleList";
				break;
			case Constants.PROCESS_TYPE_PF_LIST:
				PollutionFreeSampleList psampleList = pollutionFreeDao.getById(id);
				psampleList.setState(1);
				className = "PollutionFreeSampleList";
				break;
			default:
				break;
		}
		String pdId = this.findProcessDefinitionByDeploymentName(className);
		//如果没有查询到对应的流程定义ID，抛出异常
		if(null==pdId){
			throw new Exception("ProcessDefinitionNotFound");
		}
		String objId = className+"."+id;
		runtimeService.startProcessInstanceById(pdId, objId);
	}
	/**更新状态，启动流程实例，让启动的流程实例关联业务
	 * @throws Exception */
	@Override
	public void saveStartProcess(WorkflowBean workflowBean) {
		//1：获取请假单ID，使用请假单ID，查询请假单的对象SampleList
		Long id = workflowBean.getId();
		SampleList sampleList = sampleListDao.findSampleListById(id);
		//2：更新请假单的请假状态从0变成1（初始录入-->审核中）
		sampleList.setState(1);
		
		//获取子流程参数值
		//int n = this.checkReportService.getTheSameCount(sampleList.getSampleName());
		
		
		//3：使用当前对象获取到流程定义的key（对象的名称就是流程定义的key）
		String key = sampleList.getClass().getSimpleName();
		/**
		 * 4：从Session中获取当前任务的办理人，使用流程变量设置下一个任务的办理人
			    * inputUser是流程变量的名称，
			    * 获取的办理人是流程变量的值
		 */
		Map<String, Object> variables = new HashMap<String,Object>();
	//	variables.put("inputUser", SessionContext.get().getName());//表示惟一用户
		/**
		 * 5：	(1)使用流程变量设置字符串（格式：SampleList.id的形式），通过设置，让启动的流程（流程实例）关联业务
   				(2)使用正在执行对象表中的一个字段BUSINESS_KEY（Activiti提供的一个字段），让启动的流程（流程实例）关联业务
		 */
		//格式：SampleList.id的形式（使用流程变量）
		String objId = key+"."+id;
		variables.put("objId", objId);
		//variables.put("n", n);
		//6：使用流程定义的key，启动流程实例，同时设置流程变量，同时向正在执行的执行对象表中的字段BUSINESS_KEY添加业务数据，同时让流程关联业务
	//	runtimeService.startProcessInstanceByKey(key,objId,variables);
	//	runtimeService.startProcessInstanceByKey(key,objId);
		runtimeService.startProcessInstanceByKey(key,objId);

		
	}
	
	/**2：使用当前用户名查询正在执行的任务表，获取当前任务的集合List<Task>*/
	@Override
	public List<Task> findTaskListByName(String name) {
		List<Task> list = null;
		if("admin".equals(name)){
			list = taskService.createTaskQuery().list();
		}
		list = taskService.createTaskQuery()
					//.taskAssignee(name)//指定个人任务查询
					.taskCandidateUser(name)//角色用户查询
					.orderByTaskCreateTime().asc()//
					.list();
		return list;
	}
	
	/**使用任务ID，获取当前任务节点中对应的Form key中的连接的值*/
	@Override
	public String findTaskFormKeyByTaskId(String taskId) {
		TaskFormData formData = formService.getTaskFormData(taskId);
		//获取Form key的值
		String url = formData.getFormKey();
		return url;
	}
	
	/**一：使用任务ID，查找抽样单ID，从而获取抽样单信息*/
	@Override
	public SampleList findSampleListByTaskId(String taskId) {
		//1：使用任务ID，查询任务对象Task
		Task task = taskService.createTaskQuery()//
						.taskId(taskId)//使用任务ID查询
						.singleResult();
		
		//2：使用任务对象Task获取流程实例ID
		String processInstanceId = task.getProcessInstanceId();
		//3：使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
		ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
						.processInstanceId(processInstanceId)//使用流程实例ID查询
						.singleResult();
		//4：使用流程实例对象获取BUSINESS_KEY
		String buniness_key = pi.getBusinessKey();
		//5：获取BUSINESS_KEY对应的主键ID，使用主键ID，查询请假单对象（SampleList.1）
		String id = "";
		if(StringUtils.isNotBlank(buniness_key)){
			//截取字符串，取buniness_key小数点的第2个值
			id = buniness_key.split("\\.")[1];
		}
		//查询请假单对象
		//使用hql语句：from SampleList o where o.id=1
		SampleList sampleList = sampleListDao.findSampleListById(Long.parseLong(id));
		return sampleList;
	}
	@Override
	public AbstractSampleList findSampleListInterfaceByTaskId(String taskId){
		//1：使用任务ID，查询任务对象Task
		Task task = taskService.createTaskQuery()//
						.taskId(taskId)//使用任务ID查询
						.singleResult();
		//2：使用任务对象Task获取流程实例ID
		String processInstanceId = task.getProcessInstanceId();
		//3：使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
		ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
						.processInstanceId(processInstanceId)//使用流程实例ID查询
						.singleResult();
		//4：使用流程实例对象获取BUSINESS_KEY
		String buniness_key = pi.getBusinessKey();
		//5：获取BUSINESS_KEY对应的主键ID，使用主键ID，查询请假单对象（SampleList.1）
		String id = "";
		if(StringUtils.isNotBlank(buniness_key)){
			//截取字符串，取buniness_key小数点的第2个值
			id = buniness_key.split("\\.")[1];
		}
		//获取抽流程部署名称（同抽样单名称一致）
		ProcessDefinition tempDefination = repositoryService.createProcessDefinitionQuery().processDefinitionId(task.getProcessDefinitionId()).singleResult();
		String processDeployId = null;
		String SampleTypeName = null;
		if(null != tempDefination){
			processDeployId = tempDefination.getDeploymentId();
		}
		if(null != processDeployId){
			Deployment deployment = repositoryService.createDeploymentQuery().deploymentId(processDeployId).singleResult();
			if(null != deployment){
				SampleTypeName = deployment.getName();
			}
		}
		
		
		switch(SampleTypeName){
			case "SampleList":
				return sampleListDao.findSampleListById(Long.parseLong(id));
			case "PollutionFreeSampleList":
				return pollutionFreeDao.getById(Long.parseLong(id));
			case "CattleSampleList":
				return cattleDao.getById(Long.parseLong(id));
			case "ForestFoodSampleList":
				return forestDao.getById(Long.parseLong(id));
			case "QualitySampleList":
				return qualityDao.getById(Long.parseLong(id));
			default:
				return null;
		}
	}
	
	
	
	
	
	
	/**二：已知任务ID，查询ProcessDefinitionEntiy对象，从而获取当前任务完成之后的连线名称，并放置到List<String>集合中*/
	@Override
	public List<String> findOutComeListByTaskId(String taskId) {
		//返回存放连线的名称集合
		List<String> list = new ArrayList<String>();
		//1:使用任务ID，查询任务对象
		Task task = taskService.createTaskQuery()//
					.taskId(taskId)//使用任务ID查询
					.singleResult();
		//2：获取流程定义ID
		String processDefinitionId = task.getProcessDefinitionId();
		//3：查询ProcessDefinitionEntiy对象
		ProcessDefinitionEntity processDefinitionEntity = (ProcessDefinitionEntity) repositoryService.getProcessDefinition(processDefinitionId);
		//使用任务对象Task获取流程实例ID
//		String processInstanceId = task.getProcessInstanceId();
		//使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
//		ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
//					.processInstanceId(processInstanceId)//使用流程实例ID查询
//					.singleResult();
		String executionId =  task.getExecutionId();
		 ExecutionEntity en  = (ExecutionEntity)runtimeService.createExecutionQuery().executionId(executionId).singleResult();
		
		
		//获取当前活动的id
		String activityId = en.getActivityId();
		//4：获取当前的活动
		ActivityImpl activityImpl = processDefinitionEntity.findActivity(activityId);
		//5：获取当前活动完成之后连线的名称
		List<PvmTransition> pvmList = activityImpl.getOutgoingTransitions();
		if(pvmList!=null && pvmList.size()>0){
			for(PvmTransition pvm:pvmList){
				String name = (String) pvm.getProperty("name");
				if(StringUtils.isNotBlank(name)){
					list.add(name);
				}
				else{
					list.add("默认提交");
				}
			}
		}
		return list;
	}
	
	/**指定连线的名称完成任务*/
	@Override
	public void saveSubmitTask(WorkflowBean workflowBean) {
		//获取任务ID
		String taskId = workflowBean.getTaskId();
		//获取连线的名称
		String outcome = workflowBean.getOutcome();
		//批注信息
		String message = workflowBean.getComment();
		//获取申请单ID
		Long id = workflowBean.getId();
		
		/**
		 * 1：在完成之前，添加一个批注信息，向act_hi_comment表中添加数据，用于记录对当前申请人的一些审核信息
		 */
		//使用任务ID，查询任务对象，获取流程流程实例ID
		Task task = taskService.createTaskQuery()//
						.taskId(taskId)//使用任务ID查询
						.singleResult();
		
		
		//获取流程实例ID
		String processInstanceId = task.getProcessInstanceId();
		/**
		 * 注意：添加批注的时候，由于Activiti底层代码是使用：
		 * 		String userId = Authentication.getAuthenticatedUserId();
			    CommentEntity comment = new CommentEntity();
			    comment.setUserId(userId);
			  所有需要从Session中获取当前登录人，作为该任务的办理人（审核人），对应act_hi_comment表中的User_ID的字段，不过不添加审核人，该字段为null
			 所以要求，添加配置执行使用Authentication.setAuthenticatedUserId();添加当前任务的审核人
		 * */
		Authentication.setAuthenticatedUserId(SessionContext.get().getName());
		taskService.addComment(taskId, processInstanceId, message);
		/**
		 * 2：如果连线的名称是“默认提交”，那么就不需要设置，如果不是，就需要设置流程变量
		 * 在完成任务之前，设置流程变量，按照连线的名称，去完成任务
				 流程变量的名称：outcome
				 流程变量的值：连线的名称
		 */
		Map<String, Object> variables = new HashMap<String,Object>();
		//if(outcome!=null && !outcome.equals("默认提交")){
			variables.put("outcome", outcome);
		//}
			
		AbstractSampleList sampleList = this.findSampleListInterfaceByTaskId(taskId);
		
		//子流程执行填写检验结果将结果保存到特定的历史表中
		if("任务接收检验".equals(task.getName())){
			String name = SessionContext.get().getName();
			SubProcessHistory subProcessHistory = new SubProcessHistory();
			subProcessHistory.setCanshuMc(workflowBean.getParamName());
			subProcessHistory.setChanpinMc(workflowBean.getProductName());
			subProcessHistory.setCheckResult(workflowBean.getSingleResult());
			subProcessHistory.setCheckTime(new Date());
			subProcessHistory.setCheckMan(name);
			subProcessHistory.setTaskId(taskId);
			subProcessHistory.setResultValue(workflowBean.getResultValue());
			subProcessHistory.setProcessInstanceId(processInstanceId);
			//每一次检验操作，都会记录一条记录，此表中的数据只会增加，不会删除。
			subProcessHistoryService.saveSubProcessHistory(subProcessHistory);
			//表中的数据只有在申请单从子流程执行完后驳回时，才会删除checkReport表中的数据，子流程内部只是更新结果。
			CheckReport checkReport = checkReportService.getCheckReportListByProcessInstanceIdAndExecutionId(processInstanceId, task.getExecutionId());
			checkReport.setDealMan(name);
			checkReport.setResultValue(workflowBean.getResultValue());
			checkReport.setSingleResult(workflowBean.getSingleResult());
			checkReportService.updateCheckReport(checkReport);
		}
		
		if("领导审核".equals(task.getName()) && "驳回".equals(outcome)){
			CheckReport checkReport = checkReportService.getCheckReportListByProcessInstanceIdAndExecutionId(processInstanceId, task.getExecutionId());
			//checkReport.setExecutionId(null);
			//checkReport.setProInstanceId(null);
			checkReport.setDealMan(null);
			checkReport.setSingleResult(null);
			checkReport.setResultValue(null);
			checkReportService.updateCheckReport(checkReport);
		}
		if("登记结果".equals(task.getName())&&"驳回".equals(outcome)){
			List<CheckReport> checklist = checkReportService.getCheckReportListBySampleListId(Integer.parseInt(id.toString()));
			if(checklist != null && checklist.size()>0){
				for(CheckReport checkReport:checklist){
					checkReportService.delCheckReport(checkReport.getId());
				}
			}
		}
		if("抱怨处理".equals(task.getName())&&"检验复核".equals(outcome)){
			List<CheckReport> checklist = checkReportService.getCheckReportListBySampleListId(Integer.parseInt(id.toString()));
			if(checklist != null && checklist.size()>0){
				for(CheckReport checkReport:checklist){
					checkReportService.delCheckReport(checkReport.getId());
				}
			}
		}
		
		int n = 0;
		if("分配任务".equals(task.getName())){
			//保存检验产品
			n = this.insertCheckReport(sampleList.getCommonSampleName(),Integer.parseInt(id.toString()));
			//n = checkReportService.getTheSameCount(sampleList.getSampleName());
		}
		variables.put("n", n);
		
		//3：使用任务ID，完成当前人的个人任务，同时流程变量
		taskService.complete(taskId,variables);
		//4：当任务完成之后，需要指定下一个任务的办理人（使用类）-----已经开发完成
		
		/**
		 * 5：在完成任务之后，判断流程是否结束
   			如果流程结束了，更新请假单表的状态从1变成2（审核中-->审核完成）
		 */
		ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
						.processInstanceId(processInstanceId)//使用流程实例ID查询
						.singleResult();
		
		//流程结束了
		if(pi==null){
			//更新申请单表的状态从1变成2（审核中-->审核完成）
			sampleList.setState(2);
		}else{
		//为了检验内容和工单关联
		List<CheckReport> checkReportList = checkReportService.getCheckReportListBySampleListId(id.intValue());
		List<Task> list = taskService.createTaskQuery().processInstanceId(pi.getId()).list();
		if(list != null){
			if("任务接收检验".equals(list.get(0).getName()) && checkReportList != null && checkReportList.get(0).getExecutionId()==null ){
				
				if(list !=null && checkReportList!= null && list.size()==checkReportList.size()){
					for(int i=0; i<list.size();i++){
						Task task1 = (Task)list.get(i);
						String executionId = task1.getExecutionId();
						String proInstanceId = task1.getProcessInstanceId();
						CheckReport checkReport = checkReportList.get(i);
						checkReport.setExecutionId(executionId);
						checkReport.setProInstanceId(proInstanceId);
						this.checkReportService.updateCheckReport(checkReport);
					}
				}
			}
		}
		}
	}
	public int insertCheckReport(String sampleName,int id){
		int n = 0;
		@SuppressWarnings("unchecked")
		//工单从子流程后续环节驳回，需要清空checkReport表中的数据
		//判断依据：第一次分配任务checkReport表中时没有这条申请单的数据的，如果有，说明申请单是从后续流程驳回的，因此需要先删除。
		List<CheckReport> checklist = checkReportService.getCheckReportListBySampleListId(id);
		if(checklist != null && checklist.size()>0){
			for(CheckReport checkReport:checklist){
				checkReportService.delCheckReport(checkReport.getId());
			}
		}
		
		List<FoodParamAndEquipment> fpeList = fpeDao.getSubItemsByProductName(sampleName);
		
		if(fpeList != null && fpeList.size()>0){
			for(FoodParamAndEquipment food:fpeList){
				CheckReport checkReport = new CheckReport();
				checkReport.setXuhao(food.getSequence()+"");
				//checkReport.setCanshuId(food);
				checkReport.setParamName(food.getParamName());
				checkReport.setProductName(food.getProductName());
				checkReport.setLimit(food.getLimit());
				checkReport.setSampleListId(id);
				checkReportService.saveCheckReport(checkReport);
			}
			
			n = fpeList.size();
		}
		System.out.println(n);
		return n;
	}
	
	/**获取批注信息，传递的是当前任务ID，获取历史任务ID对应的批注*/
	@Override
	public List<HistoryComment> findCommentByTaskId(String taskId) {
		List<Comment> list = new ArrayList<Comment>();
		//使用当前的任务ID，查询当前流程对应的历史任务ID
		//使用当前任务ID，获取当前任务对象
		Task task = taskService.createTaskQuery()//
				.taskId(taskId)//使用任务ID查询
				.singleResult();
		//获取流程实例ID
		String processInstanceId = task.getProcessInstanceId();
//		//使用流程实例ID，查询历史任务，获取历史任务对应的每个任务ID
//		List<HistoricTaskInstance> htiList = historyService.createHistoricTaskInstanceQuery()//历史任务表查询
//						.processInstanceId(processInstanceId)//使用流程实例ID查询
//						.list();
//		//遍历集合，获取每个任务ID
//		if(htiList!=null && htiList.size()>0){
//			for(HistoricTaskInstance hti:htiList){
//				//任务ID
//				String htaskId = hti.getId();
//				//获取批注信息
//				List<Comment> taskList = taskService.getTaskComments(htaskId);//对用历史完成后的任务ID
//				list.addAll(taskList);
//			}
//		}
		list = taskService.getProcessInstanceComments(processInstanceId);
		List <HistoryComment> commentList = new ArrayList<HistoryComment>();
		for(int i=0; i<list.size(); i++){
			Comment comment = (Comment)list.get(i);
			String tId = comment.getTaskId();
			HistoricTaskInstance t = historyService.createHistoricTaskInstanceQuery().taskId(tId).singleResult();
			HistoryComment hc = new HistoryComment();
			hc.setDealMan(comment.getUserId());
			hc.setDealTime(comment.getTime());
			hc.setHtName(t.getName());
			hc.setMessage(comment.getFullMessage());
			hc.setProcessInstanceId(comment.getProcessInstanceId());
			hc.setTaskId(tId);
			commentList.add(hc);
		}
		
		return commentList;
	}
	
	/**使用请假单ID，查询历史批注信息*/
	@Override
	public List<Comment> findCommentBySampleListId(Long id) {
		//使用请假单ID，查询请假单对象
		SampleList sampleList = sampleListDao.findSampleListById(id);
		//获取对象的名称
		String objectName = sampleList.getClass().getSimpleName();
		//组织流程表中的字段中的值
		String objId = objectName+"."+id;
		
		/**1:使用历史的流程实例查询，返回历史的流程实例对象，获取流程实例ID*/
		HistoricProcessInstance hpi = historyService.createHistoricProcessInstanceQuery()//对应历史的流程实例表
						.processInstanceBusinessKey(objId)//使用BusinessKey字段查询
						.singleResult();
		//流程实例ID
		String processInstanceId = hpi.getId();
		/**2:使用历史的流程变量查询，返回历史的流程变量的对象，获取流程实例ID*/
//		HistoricVariableInstance hvi = historyService.createHistoricVariableInstanceQuery()//对应历史的流程变量表
//						.variableValueEquals("objId", objId)//使用流程变量的名称和流程变量的值查询
//						.singleResult();
//		//流程实例ID
//		String processInstanceId = hvi.getProcessInstanceId();
		List<Comment> list = taskService.getProcessInstanceComments(processInstanceId);
		return list;
	}
	
	@Override
	public List<Comment> findCommentByProcessId(String processId) throws Exception {
		
		/**1:使用历史的流程实例查询，返回历史的流程实例对象，获取流程实例ID*/
		HistoricProcessInstance hpi = historyService.createHistoricProcessInstanceQuery()//对应历史的流程实例表
						.processInstanceBusinessKey(processId)//使用BusinessKey字段查询
						.singleResult();
		//TODO
		if(null == hpi){
			throw new Exception("ProcessInstanceNotFound");
		}
		String processInstanceId = hpi.getId();
		List<Comment> list = taskService.getProcessInstanceComments(processInstanceId);
		return list;
	}
	
	
	
	
	/**1：获取任务ID，获取任务对象，使用任务对象获取流程定义ID，查询流程定义对象*/
	@Override
	public ProcessDefinition findProcessDefinitionByTaskId(String taskId) {
		//使用任务ID，查询任务对象
		Task task = taskService.createTaskQuery()//
					.taskId(taskId)//使用任务ID查询
					.singleResult();
		//获取流程定义ID
		String processDefinitionId = task.getProcessDefinitionId();
		//查询流程定义的对象
		ProcessDefinition pd = repositoryService.createProcessDefinitionQuery()//创建流程定义查询对象，对应表act_re_procdef 
					.processDefinitionId(processDefinitionId)//使用流程定义ID查询
					.singleResult();
		return pd;
	}
	
	/**
	 * 二：查看当前活动，获取当期活动对应的坐标x,y,width,height，将4个值存放到Map<String,Object>中
		 map集合的key：表示坐标x,y,width,height
		 map集合的value：表示坐标对应的值
	 */
	@Override
	public Map<String, Object> findCoordingByTask(String taskId) {
		//ActivityExecution

			
			
		//存放坐标
		Map<String, Object> map = new HashMap<String,Object>();
		//使用任务ID，查询任务对象
		Task task = taskService.createTaskQuery()//
					.taskId(taskId)//使用任务ID查询
					.singleResult();
		
		
		//获取流程定义的ID
		String processDefinitionId = task.getProcessDefinitionId();
		//获取流程定义的实体对象（对应.bpmn文件中的数据）
		ProcessDefinitionEntity processDefinitionEntity = (ProcessDefinitionEntity)repositoryService.getProcessDefinition(processDefinitionId);
		//流程实例ID
		String processInstanceId = task.getProcessInstanceId();
		//使用流程实例ID，查询正在执行的执行对象表，获取当前活动对应的流程实例对象
		ProcessInstance pi = runtimeService.createProcessInstanceQuery()//创建流程实例查询
					.processInstanceId(processInstanceId)//使用流程实例ID查询
					.singleResult();
		//获取当前活动的ID
		
//		ExecutionEntityManager em = managementService.e
//		CommandContext cmmContext = Context.getCommandContext();  
//		ExecutionEntityManager exeEntityManager = cmmContext.getExecutionEntityManager();  
//		exeEntityManager.findChildExecutionsByProcessInstanceId("").size();
		
		String executionId =  task.getExecutionId();
		 ExecutionEntity en  = (ExecutionEntity)runtimeService.createExecutionQuery().executionId(executionId).singleResult();
		// List<Execution> e = runtimeService.createExecutionQuery().processDefinitionKey("subprocess1").list();
		//String activityId = e.getActivityId();
		String activityId = en.getActivityId();
		//获取当前活动对象
		ActivityImpl activityImpl = processDefinitionEntity.findActivity(activityId);//活动ID
		//获取坐标
		map.put("x", activityImpl.getX());
		map.put("y", activityImpl.getY());
		map.put("width", activityImpl.getWidth());
		map.put("height", activityImpl.getHeight());
		return map;
	}

	public ISampleListDao getSampleListDao() {
		return sampleListDao;
	}

	public void setSampleListDao(ISampleListDao sampleListDao) {
		this.sampleListDao = sampleListDao;
	}

	public CheckReportService getCheckReportService() {
		return checkReportService;
	}

	public void setCheckReportService(CheckReportService checkReportService) {
		this.checkReportService = checkReportService;
	}

	public void setFoodParametersEquipmentService(
			FoodParametersEquipmentService foodParametersEquipmentService) {
		this.foodParametersEquipmentService = foodParametersEquipmentService;
	}

	@Override
	public List<String> findOutComeListByActivityExecution(
			ActivityExecution execution, String taskId) {
		return null;
	}

	@Override
	public Map<String, Object> findCoordingByTask(ActivityExecution execution,
			String taskId) {
		return null;
	}

	@Override
	public String findProcessDefinitionByDeploymentName(String deploymentName) {
		Deployment d = repositoryService.createDeploymentQuery().deploymentName(deploymentName).singleResult();
		String id =  repositoryService.createProcessDefinitionQuery().deploymentId(d.getId()).singleResult().getId();
		if(null != id){
			return id;
		}
		return null;
	}
	
	
	public void setSubProcessHistoryService(
			SubProcessHistoryService subProcessHistoryService) {
		this.subProcessHistoryService = subProcessHistoryService;
	}



	public IPollutionFreeSampleListDao getPollutionFreeDao() {
		return pollutionFreeDao;
	}



	public void setPollutionFreeDao(IPollutionFreeSampleListDao pollutionFreeDao) {
		this.pollutionFreeDao = pollutionFreeDao;
	}



	public IQualitySampleListDao getQualityDao() {
		return qualityDao;
	}



	public void setQualityDao(IQualitySampleListDao qualityDao) {
		this.qualityDao = qualityDao;
	}



	public IForestFoodSampleListDao getForestDao() {
		return forestDao;
	}



	public void setForestDao(IForestFoodSampleListDao forestDao) {
		this.forestDao = forestDao;
	}



	public ICattleSampleListDao getCattleDao() {
		return cattleDao;
	}



	public IFoodParamAndEquipmentDao getFpeDao() {
		return fpeDao;
	}



	public void setFpeDao(IFoodParamAndEquipmentDao fpeDao) {
		this.fpeDao = fpeDao;
	}



	public void setCattleDao(ICattleSampleListDao cattleDao) {
		this.cattleDao = cattleDao;
	}

}
