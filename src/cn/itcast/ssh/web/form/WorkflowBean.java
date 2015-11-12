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
	/**
	 * 以下字段为传值
	 */
	private String chanpinMc;
	private String canshuMc;
	private String yxbhfw;
	private String checkbase;
	private String resultValue;
	private String singleResult;
	//---------------------------------------------
	public File getFile() {
		return file;
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
	public String getChanpinMc() {
		return chanpinMc;
	}
	public void setChanpinMc(String chanpinMc) {
		this.chanpinMc = chanpinMc;
	}
	public String getCanshuMc() {
		return canshuMc;
	}
	public void setCanshuMc(String canshuMc) {
		this.canshuMc = canshuMc;
	}
	public String getYxbhfw() {
		return yxbhfw;
	}
	public void setYxbhfw(String yxbhfw) {
		this.yxbhfw = yxbhfw;
	}
	public String getCheckbase() {
		return checkbase;
	}
	public void setCheckbase(String checkbase) {
		this.checkbase = checkbase;
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
