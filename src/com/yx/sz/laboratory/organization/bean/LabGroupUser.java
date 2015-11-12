package com.yx.sz.laboratory.organization.bean;

import java.util.Set;

public class LabGroupUser {

	private int id;
	
	private String taskId;
	
	private String taskName;
	
	private String processDefinitionId;
	
	private String processDefinitionName;
	
	private String groupId;
	
	private String groupName;
	
	private String userId;
	
	private String userName;
	
	private String remark;
	
	private LabRole role; //角色
	
	private Set<LabFlowGroup> flowGroups; //流程组
	
	
	

	public LabRole getRole() {
		return role;
	}

	public void setRole(LabRole role) {
		this.role = role;
	}

	public Set<LabFlowGroup> getFlowGroups() {
		return flowGroups;
	}

	public void setFlowGroups(Set<LabFlowGroup> flowGroups) {
		this.flowGroups = flowGroups;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getProcessDefinitionName() {
		return processDefinitionName;
	}

	public void setProcessDefinitionName(String processDefinitionName) {
		this.processDefinitionName = processDefinitionName;
	}
}
