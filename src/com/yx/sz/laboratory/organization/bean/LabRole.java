package com.yx.sz.laboratory.organization.bean;

import java.util.Set;

/**
 * 
 * 用户角色
 * 
 * @author stdt
 *
 */
public class LabRole {
	private Long id; //主键
	private String name; //名称
	private String remark; //说明
	private int seq; //排序
	private Set<LabGroupUser> users; //角色包含的用户
	private Set<LabPrivilege> privileges; //角色包含的权限
	
	
	
	public Set<LabPrivilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Set<LabPrivilege> privileges) {
		this.privileges = privileges;
	}
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
