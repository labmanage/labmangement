package com.yx.sz.laboratory.organization.bean;

public class SearchBean {
	private Long id;
	private String privilegeId ;
	private Long roleId;
	private Long userId;
	private String url;
	
	
	
	
	
	
	
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrivilegeId() {
		return privilegeId;
	}
	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAction(){
		String action = this.url;
		if(null != action && action.length() > 0){
			action = action.split("\\?")[0];
			action = action.split("\\.")[0];
		}
		return action;
	}
}
