package com.yx.sz.laboratory.proStandLibrary.bean;

import java.util.Date;

/**
 * 抽检食品检验子项历史
 * @author liuhb
 *
 */
public class SubProcessHistory {
	
	private int id;
	
	/**
	 * 产品序号
	 */
	private String xuhao;
	
	/**
	 * 产品名称
	 */
	private String chanpinMc;
	
	/**
	 * 参数ID
	 */
	private String canshuId;
	
	/**
	 * 参数名称
	 */
	private String canshuMc;
	
	/**
	 * 检验人员
	 */
	private String checkMan;
	
	/**
	 * 检验结果
	 */
	private String checkResult;
	
	/**
	 * 检验时间
	 */
	private Date checkTime;
	
	/**
	 * 单项结论
	 */
	private String resultValue;
	
	/**
	 * 用于关联主流程的历史环节
	 */
	private String commentId;
	
	private String processInstanceId;
	
	private String taskId;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getXuhao() {
		return xuhao;
	}

	public void setXuhao(String xuhao) {
		this.xuhao = xuhao;
	}

	public String getChanpinMc() {
		return chanpinMc;
	}

	public void setChanpinMc(String chanpinMc) {
		this.chanpinMc = chanpinMc;
	}

	public String getCanshuId() {
		return canshuId;
	}

	public void setCanshuId(String canshuId) {
		this.canshuId = canshuId;
	}

	public String getCanshuMc() {
		return canshuMc;
	}

	public void setCanshuMc(String canshuMc) {
		this.canshuMc = canshuMc;
	}

	public String getCheckMan() {
		return checkMan;
	}

	public void setCheckMan(String checkMan) {
		this.checkMan = checkMan;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getResultValue() {
		return resultValue;
	}

	public void setResultValue(String resultValue) {
		this.resultValue = resultValue;
	}
	
	
	

}
