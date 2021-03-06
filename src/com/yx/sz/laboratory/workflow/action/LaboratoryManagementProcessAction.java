package com.yx.sz.laboratory.workflow.action;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.apache.struts2.ServletActionContext;

import cn.itcast.ssh.utils.Constants;
import cn.itcast.ssh.utils.SessionContext;
import cn.itcast.ssh.utils.ValueContext;
import cn.itcast.ssh.web.form.WorkflowBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.proStandLibrary.bean.HistoryComment;
import com.yx.sz.laboratory.proStandLibrary.bean.SubProcessHistory;
import com.yx.sz.laboratory.proStandLibrary.service.CheckReportService;
import com.yx.sz.laboratory.proStandLibrary.service.SubProcessHistoryService;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.service.FoodParamAndEquipmentService;
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
import com.yx.sz.laboratory.workflow.service.ICattleSampleListService;
import com.yx.sz.laboratory.workflow.service.IForestFoodSampleListService;
import com.yx.sz.laboratory.workflow.service.ILaboratoryManagementService;
import com.yx.sz.laboratory.workflow.service.IPollutionFreeSampleListService;
import com.yx.sz.laboratory.workflow.service.IQualitySampleListService;
import com.yx.sz.laboratory.workflow.service.ISampleListService;

public class LaboratoryManagementProcessAction extends ActionSupport implements
		ModelDriven<WorkflowBean> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SampleList samplelist = new SampleList();
	
	private ISampleListService samplelistService;

	private WorkflowBean workflowBean = new WorkflowBean();
	
	private ILaboratoryManagementService laboratoryManagementService;
	
	//private FoodParametersEquipmentService foodParametersEquipmentService;
	private FoodParamAndEquipmentService fpeService;
	
	private TaskService taskService;
	
	private CheckReportService checkReportService;
	
	private SubProcessHistoryService subProcessHistoryService;
	
	private List<CheckReport> list = new ArrayList<CheckReport>();
	
	private List<FoodParamAndEquipment> foodlist = new ArrayList<FoodParamAndEquipment>();
	
	private List<CheckReport> listarray = new ArrayList<CheckReport>();
	
	SubProcessHistory subprocessHistory = new SubProcessHistory();
	
	private IPollutionFreeSampleListService pollutionFreeService;
	private IQualitySampleListService qualityService;
	private IForestFoodSampleListService forestService;
	private ICattleSampleListService cattleService;
	
	/**
	 * 部署管理首页显示
	 * @return
	 */
	public String deployHome(){
		//1:查询部署对象信息，对应表（act_re_deployment）
		List<Deployment> depList = laboratoryManagementService.findDeploymentList();
		//2:查询流程定义的信息，对应表（act_re_procdef）
		List<ProcessDefinition> pdList = laboratoryManagementService.findProcessDefinitionList();
		//放置到上下文对象中
		ValueContext.putValueContext("depList", depList);
		ValueContext.putValueContext("pdList", pdList);
		return "deployHome";
	}
	
	/**
	 * 发布流程
	 * @return
	 */
	public String newdeploy(){
		//获取页面传递的值
		//1：获取页面上传递的zip格式的文件，格式是File类型
		File file = workflowBean.getFile();
		//文件名称
		String filename = workflowBean.getFilename();
		//完成部署
		laboratoryManagementService.saveNewDeploye(file,filename);
		return "list";
	}
	
	/**
	 * 删除部署信息
	 */
	public String delDeployment(){
		//1：获取部署对象ID
		String deploymentId = workflowBean.getDeploymentId();
		//2：使用部署对象ID，删除流程定义
		laboratoryManagementService.deleteProcessDefinitionByDeploymentId(deploymentId);
		return "list";
	}
	
	/**
	 * 查看流程图
	 * @throws Exception 
	 */
	public String viewImage() throws Exception{
		//1：获取页面传递的部署对象ID和资源图片名称
		//部署对象ID
		String deploymentId = workflowBean.getDeploymentId();
		//资源图片名称
		String imageName = workflowBean.getImageName();
		//2：获取资源文件表（act_ge_bytearray）中资源图片输入流InputStream
		InputStream in = laboratoryManagementService.findImageInputStream(deploymentId,imageName);
		//3：从response对象获取输出流
		OutputStream out = ServletActionContext.getResponse().getOutputStream();
		//4：将输入流中的数据读取出来，写到输出流中
		for(int b=-1;(b=in.read())!=-1;){
			out.write(b);
		}
		out.close();
		in.close();
		//将图写到页面上，用输出流写
		return null;
	}
	
	// 启动流程
	public String startProcess(){
		//更新抽样单状态，启动流程实例，让启动的流程实例关联业务
		try {
			//laboratoryManagementService.saveStartProcess(workflowBean);
			laboratoryManagementService.saveStartProcessById(workflowBean);
		} catch (Exception e) {
			e.printStackTrace();
			return "processDefinationNotFound";
		}
		return "listTask";
	}
	
	public String viewSubHisComment(){
		
		SubProcessHistory subprocessHistory = subProcessHistoryService.getSubProcessHistoryListByProInstanceIdAndTaskId(workflowBean.getProcessInstanceId(), workflowBean.getTaskId());
		
		ValueContext.putValueStack(subprocessHistory);
		
		return "viewSubHisComment";
	}
	
	/**
	 * 任务管理首页显示
	 * @return
	 */
	public String listTask(){
		//1：从Session中获取当前用户名
		String name = SessionContext.get().getName();
		//2：使用当前用户名查询正在执行的任务表，获取当前任务的集合List<Task>
		List<Task> list = laboratoryManagementService.findTaskListByName(name); 
		List<Task> list1 = new ArrayList();
		if(list != null && list.size()>0){
			
			for(Task task:list){
				String taskName = task.getName();
				if("任务接收检验".equals(taskName)){
					CheckReport checkReport = checkReportService.getCheckReportListByProcessInstanceIdAndExecutionId(task.getProcessInstanceId(),task.getExecutionId());
					//if(checkReport.getCanshuMc() != null){
						task.setName("子流程_"+task.getName()+"_"+checkReport.getParamName());
					//}
					list1.add(task);
				}else{
					list1.add(task);
				}
			}
		}
		
		ValueContext.putValueContext("list", list1);
		return "task";
	}
	
	/**
	 * 打开任务表单
	 */
	public String viewTaskForm(){
		//任务ID
		String taskId = workflowBean.getTaskId();
		String executionId = workflowBean.getExecutionId();
		
		//获取任务表单中任务节点的url连接
		String url = laboratoryManagementService.findTaskFormKeyByTaskId(taskId);
		url += "?taskId="+taskId+"&executionId="+executionId;
		ValueContext.putValueContext("url", url);
		return "viewTaskForm";
	}
	
	// 准备表单数据
	public String audit(){
		//获取任务ID
		String taskId = workflowBean.getTaskId();
		String executionId = workflowBean.getExecutionId();
		/**一：使用任务ID，查找抽检单ID，从而获取请假单信息*/
//		SampleList sampleList = laboratoryManagementService.findSampleListByTaskId(taskId);
		
		String formUrl = "taskForm";
		AbstractSampleList sampleList = laboratoryManagementService.findSampleListInterfaceByTaskId(taskId);
		if(null == sampleList){
			return "processInstanceNotFound";
		}
		switch(sampleList.getSampleSubType()){
		case Constants.PROCESS_TYPE_SAMPLE_LIST:
			ValueContext.putValueStack((SampleList)sampleList);
			formUrl = "taskForm";
			break;
		case Constants.PROCESS_TYPE_CATTLE_SAMPLE_LIST:
			ValueContext.putValueStack((CattleSampleList)sampleList);
			formUrl = "ctaskForm";
			break;
		case Constants.PROCESS_TYPE_FOREST_LIST:
			ValueContext.putValueStack((ForestFoodSampleList)sampleList);
			formUrl = "ftaskForm";
			break;
		case Constants.PROCESS_TYPE_QUALITY_LIST:
			ValueContext.putValueStack((QualitySampleList)sampleList);
			formUrl = "qtaskForm";
			break;
		case Constants.PROCESS_TYPE_PF_LIST:
			ValueContext.putValueStack((PollutionFreeSampleList)sampleList);
			formUrl = "ptaskForm";
			break;
		default:
			break;
	}
		
		
		
		
		/**二：已知任务ID，查询ProcessDefinitionEntiy对象，从而获取当前任务完成之后的连线名称，并放置到List<String>集合中*/
		List<String> outcomeList = laboratoryManagementService.findOutComeListByTaskId(taskId);
		ValueContext.putValueContext("outcomeList", outcomeList);
		/**三：查询所有历史审核人的审核信息，帮助当前人完成审核，返回List<Comment>*/
		List<HistoryComment> commentList = laboratoryManagementService.findCommentByTaskId(taskId);
		ValueContext.putValueContext("commentList", commentList);
		//环节名称
		String name = taskService.createTaskQuery().taskId(taskId).singleResult().getName();
	//	if(name != null &&"分配任务".equals(name)){
			workflowBean.setHtName(name);
			//List listarray = new ArrayList();
//			if(!"任务接收检验".equals(name)||"领导审核".equals(name)){
//				listarray = this.checkReportService.getCheckReportListBySampleListIdAndExecutionId(Integer.parseInt(sampleList.getId().toString()),executionId);
//			}else{
//				listarray = this.checkReportService.getCheckReportListBySampleListId(Integer.parseInt(sampleList.getId().toString()));
//			}
//			if(listarray != null && listarray.size()>0){
//				 foodlist = null;
//			}
			
			if("收样确认".equals(name)||"检验接受".equals(name)||"样品领取".equals(name)||"分配任务".equals(name)){
				foodlist = fpeService.getSubItemsByProductName(sampleList.getCommonSampleName());
			}else if("任务接收检验".equals(name)||"领导审核".equals(name)){
				ValueContext.putValueContext("workflowBean", workflowBean);
				listarray = this.checkReportService.getCheckReportListBySampleListIdAndExecutionId(Integer.parseInt(sampleList.getId()+""),executionId);
			}else{
				listarray = this.checkReportService.getCheckReportListBySampleListId(Integer.parseInt(sampleList.getId()+""));
			}
			ValueContext.putValueContext("workflowBean", workflowBean);
		return formUrl;
	}
	
	/**
	 * 提交任务
	 */
	public String submitTask(){
		
		laboratoryManagementService.saveSubmitTask(workflowBean);
		return "listTask";
	}
	
	/**
	 * 查看当前流程图（查看当前活动节点，并使用红色的框标注）
	 */
	public String viewCurrentImage(){
		//任务ID
		String taskId = workflowBean.getTaskId();
		/**一：查看流程图*/
		//1：获取任务ID，获取任务对象，使用任务对象获取流程定义ID，查询流程定义对象
		ProcessDefinition pd = laboratoryManagementService.findProcessDefinitionByTaskId(taskId);
		//workflowAction_viewImage?deploymentId=<s:property value='#deploymentId'/>&imageName=<s:property value='#imageName'/>
		ValueContext.putValueContext("deploymentId", pd.getDeploymentId());
		ValueContext.putValueContext("imageName", pd.getDiagramResourceName());
		/**二：查看当前活动，获取当期活动对应的坐标x,y,width,height，将4个值存放到Map<String,Object>中*/
		Map<String, Object> map = laboratoryManagementService.findCoordingByTask(taskId);
		ValueContext.putValueContext("acs", map);
		return "image";
	}
	
	// 查看历史的批注信息
	public String viewHisComment(){
		//获取清单ID
		Long id = workflowBean.getId();
		//TODO 使用新的方式查询sampleList
		//1：使用请假单ID，查询请假单对象，将对象放置到栈顶，支持表单回显
		String formUrl = "viewHisComment";
		String processTypeName = "SampleList";
		switch(workflowBean.getProcessType()){
		case Constants.PROCESS_TYPE_SAMPLE_LIST:
			ValueContext.putValueStack(samplelistService.findSampleListById(id));
			formUrl = "viewHisComment";
			break;
		case Constants.PROCESS_TYPE_CATTLE_SAMPLE_LIST:
			ValueContext.putValueStack(cattleService.findById(id));
			processTypeName = "CattleSampleList";
			formUrl = "cviewHisComment";
			break;
		case Constants.PROCESS_TYPE_FOREST_LIST:
			ValueContext.putValueStack(forestService.findById(id));
			processTypeName = "ForestFoodSampleList";
			formUrl = "fviewHisComment";
			break;
		case Constants.PROCESS_TYPE_QUALITY_LIST:
			ValueContext.putValueStack(qualityService.findById(id));
			processTypeName = "QualitySampleList";
			formUrl = "qviewHisComment";
			break;
		case Constants.PROCESS_TYPE_PF_LIST:
			ValueContext.putValueStack(pollutionFreeService.findById(id));
			processTypeName = "PollutionFreeSampleList";
			formUrl = "pviewHisComment";
			break;
		default:
			break;
		}
		//2：使用请假单ID，查询历史的批注信息
		List<HistoryComment> commentList = new ArrayList<HistoryComment>();
		try {
			commentList = laboratoryManagementService.findCommentByProcessId(processTypeName+"."+id);
		} catch (Exception e) {
			e.printStackTrace();
			return "processInstanceNotFound";
		}
		ValueContext.putValueContext("commentList", commentList);
		return formUrl;
	}
	

	public SampleList getSamplelist() {
		return samplelist;
	}

	public void setSamplelist(SampleList samplelist) {
		this.samplelist = samplelist;
	}

	public ISampleListService getSamplelistService() {
		return samplelistService;
	}

	public void setSamplelistService(ISampleListService samplelistService) {
		this.samplelistService = samplelistService;
	}
	
	@Override
	public WorkflowBean getModel() {
		return workflowBean;
	}

	public ILaboratoryManagementService getLaboratoryManagementService() {
		return laboratoryManagementService;
	}

	public void setLaboratoryManagementService(
			ILaboratoryManagementService laboratoryManagementService) {
		this.laboratoryManagementService = laboratoryManagementService;
	}

	public WorkflowBean getWorkflowBean() {
		return workflowBean;
	}

	public void setWorkflowBean(WorkflowBean workflowBean) {
		this.workflowBean = workflowBean;
	}

	public CheckReportService getCheckReportService() {
		return checkReportService;
	}

	public void setCheckReportService(CheckReportService checkReportService) {
		this.checkReportService = checkReportService;
	}

	public List<CheckReport> getList() {
		return list;
	}

	public void setList(List<CheckReport> list) {
		this.list = list;
	}

	public TaskService getTaskService() {
		return taskService;
	}

	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}




	public FoodParamAndEquipmentService getFpeService() {
		return fpeService;
	}

	public void setFpeService(FoodParamAndEquipmentService fpeService) {
		this.fpeService = fpeService;
	}

	public List<FoodParamAndEquipment> getFoodlist() {
		return foodlist;
	}

	public void setFoodlist(List<FoodParamAndEquipment> foodlist) {
		this.foodlist = foodlist;
	}

	public SubProcessHistoryService getSubProcessHistoryService() {
		return subProcessHistoryService;
	}

	public void setSubProcessHistoryService(
			SubProcessHistoryService subProcessHistoryService) {
		this.subProcessHistoryService = subProcessHistoryService;
	}

	public SubProcessHistory getSubprocessHistory() {
		return subprocessHistory;
	}

	public void setSubprocessHistory(SubProcessHistory subprocessHistory) {
		this.subprocessHistory = subprocessHistory;
	}

	public List<CheckReport> getListarray() {
		return listarray;
	}

	public void setListarray(List<CheckReport> listarray) {
		this.listarray = listarray;
	}

	public IPollutionFreeSampleListService getPollutionFreeService() {
		return pollutionFreeService;
	}

	public void setPollutionFreeService(
			IPollutionFreeSampleListService pollutionFreeService) {
		this.pollutionFreeService = pollutionFreeService;
	}

	public IQualitySampleListService getQualityService() {
		return qualityService;
	}

	public void setQualityService(IQualitySampleListService qualityService) {
		this.qualityService = qualityService;
	}

	public IForestFoodSampleListService getForestService() {
		return forestService;
	}

	public void setForestService(IForestFoodSampleListService forestService) {
		this.forestService = forestService;
	}

	public ICattleSampleListService getCattleService() {
		return cattleService;
	}

	public void setCattleService(ICattleSampleListService cattleService) {
		this.cattleService = cattleService;
	}

	

}
