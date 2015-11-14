package cn.itcast.ssh.web.form;

import java.io.File;

public class WorkflowBean {

	private File file;		//流程定义部署文件
	private String filename;//流程定义名称
	
	private Long id;//申请单ID
	
	private String deploymentId;//部署对象ID
	private String imageName;	//资源文件名称
	private String taskId;		//任务ID
	private String outcome;		//连线名称
	private String comment;		//备注
	private String htName;//流程环节名称
	private String executionId;
	private String processInstanceId;
	private String processDefinationId;//流程定义ID；
	private int processType;//流程类型
	
	
	
	
	/**
	 * 以下字段为传值
	 */
	private String productName;
	private String paramName;;
	private String limit;
	private String canCheckAndShouldCheck;
	private String resultValue;
	private String singleResult;
	
	//---------------------------------------------
	
	public File getFile() {
		return file;
	}
	public String getProcessDefinationId() {
		return processDefinationId;
	}
	public void setProcessDefinationId(String processDefinationId) {
		this.processDefinationId = processDefinationId;
	}
	public int getProcessType() {
		return processType;
	}
	public void setProcessType(int processType) {
		this.processType = processType;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeploymentId() {
		return deploymentId;
	}
	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getHtName() {
		return htName;
	}
	public void setHtName(String htName) {
		this.htName = htName;
	}
	public String getExecutionId() {
		return executionId;
	}
	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getCanCheckAndShouldCheck() {
		return canCheckAndShouldCheck;
	}
	public void setCanCheckAndShouldCheck(String canCheckAndShouldCheck) {
		this.canCheckAndShouldCheck = canCheckAndShouldCheck;
	}
	public String getResultValue() {
		return resultValue;
	}
	public void setResultValue(String resultValue) {
		this.resultValue = resultValue;
	}
	public String getSingleResult() {
		return singleResult;
	}
	public void setSingleResult(String singleResult) {
		this.singleResult = singleResult;
	}
	public String getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	
	
}
