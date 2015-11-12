package com.yx.sz.laboratory.organization.bean;

import java.util.Set;

public class LabPrivilege {
	private Long id; //主键
	private String name; //名称
	private String icon; //图标
	private String url; //URL
	private String remark; //说明 
	private int seq; //序列
	private Set<LabRole> roles;//包含的角色
	
	
	public Set<LabRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<LabRole> roles) {
		this.roles = roles;
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
