package com.yx.sz.laboratory.proStandLibrary.bean;

import java.util.Date;

public class HistoryComment {

	private String id;
	
	private String htName;
	
	private String dealMan;
	
	private String message;
	
	private Date dealTime;
	
	private String taskId;
	
	private String processInstanceId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHtName() {
		return htName;
	}

	public void setHtName(String htName) {
		this.htName = htName;
	}

	public String getDealMan() {
		return dealMan;
	}

	public void setDealMan(String dealMan) {
		this.dealMan = dealMan;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	
	
}
