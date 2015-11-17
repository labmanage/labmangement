package com.yx.sz.laboratory.workflow.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;

import cn.itcast.ssh.web.form.WorkflowBean;

import com.yx.sz.laboratory.proStandLibrary.bean.HistoryComment;
import com.yx.sz.laboratory.workflow.bean.AbstractSampleList;
import com.yx.sz.laboratory.workflow.bean.SampleList;

public interface ILaboratoryManagementService {

	void saveNewDeploye(File file, String filename);

	List<Deployment> findDeploymentList();

	List<ProcessDefinition> findProcessDefinitionList();

	InputStream findImageInputStream(String deploymentId, String imageName);

	void deleteProcessDefinitionByDeploymentId(String deploymentId);

	void saveStartProcess(WorkflowBean workflowBean);

	List<Task> findTaskListByName(String name);

	String findTaskFormKeyByTaskId(String taskId);

	SampleList findSampleListByTaskId(String taskId);

	List<String> findOutComeListByTaskId(String taskId);

	void saveSubmitTask(WorkflowBean workflowBean);

	List<HistoryComment> findCommentByTaskId(String taskId);

	List<Comment> findCommentBySampleListId(Long id);

	ProcessDefinition findProcessDefinitionByTaskId(String taskId);

	Map<String, Object> findCoordingByTask(String taskId);
	
	public List<String> findOutComeListByActivityExecution(ActivityExecution execution,String taskId);
	
	public Map<String, Object> findCoordingByTask(ActivityExecution execution,String taskId);

	String findProcessDefinitionByDeploymentName(String deploymentName);

	/**
	 * 使用id启动流程
	 * @param workflowBean
	 * @throws Exception
	 */
	void saveStartProcessById(WorkflowBean workflowBean) throws Exception;

	/**
	 * 返回抽样单的抽象父类
	 * @param taskId
	 * @return
	 */
	AbstractSampleList findSampleListInterfaceByTaskId(String taskId);

	/**
	 * 流程实例是由抽样单类型+id的形式标示的，例如畜产品抽样单为：CattleSampleList.6
	 * @param samleListTypeName
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	List<HistoryComment> findCommentByProcessId(String processId) throws Exception;

}
