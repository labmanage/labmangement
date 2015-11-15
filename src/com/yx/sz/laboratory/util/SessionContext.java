package com.yx.sz.laboratory.util;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.itcast.ssh.domain.Employee;

import com.yx.sz.laboratory.organization.bean.LabPrivilege;

public class SessionContext {

	public static final String GLOBLE_USER_SESSION = "globle_user";
	public static final String ALL_PRIVILEGE = "all_privilege";
	
	public static void setUser(Employee user){
		if(user!=null){
			ServletActionContext.getRequest().getSession().setAttribute(GLOBLE_USER_SESSION, user);
		}else{
			ServletActionContext.getRequest().getSession().removeAttribute(GLOBLE_USER_SESSION);
		}
	}
	
	public static Employee get(){
		return (Employee) ServletActionContext.getRequest().getSession().getAttribute(GLOBLE_USER_SESSION);
	}
	
	public static void putAllPrivileges(List<LabPrivilege> list){
		ServletActionContext.getRequest().getSession().setAttribute(ALL_PRIVILEGE, list);
	}
	@SuppressWarnings("unchecked")
	public static List<LabPrivilege> getAllPrivileges(){
		Object o = ServletActionContext.getRequest().getSession().getAttribute(ALL_PRIVILEGE);
		if(o != null){
			return (List<LabPrivilege>)o;
		}else{
			return null;
		}
	}
}
