package com.yx.sz.laboratory.organization.bean;

import java.util.Set;

/**
 * 流程分组
 * @author stdt
 *
 */
public class LabFlowGroup {
	private Long id; //主键
	private String name; //名称
	private String processDefinitionId; //流程id
	private String remark; //说明
	private int seq; //序列
	private Set<LabGroupUser> users; //包含的用户
	
	
	
	
	
	public Set<LabGroupUser> getUsers() {
		return users;
	}
	public void setUsers(Set<LabGroupUser> users) {
		this.users = users;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProcessDefinitionId() {
		return processDefinitionId;
	}
	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	
	
}
