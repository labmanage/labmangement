package com.yx.sz.laboratory.organization.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.IEmployeeService;
import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.organization.service.ILabPrivilegeService;
import com.yx.sz.laboratory.organization.service.ILabRoleService;

public class RoleAction implements ModelDriven<LabRole> {

	private LabRole role = new LabRole();
	
	private ILabRoleService roleService;
	
	private IEmployeeService employeeService;

	private String userId;
	
	private String privilegeId;
	
	private ILabPrivilegeService privilegeService;
	
	public String add() {
		role.setUsers(new HashSet<Employee>());
		role.setPrivileges(new HashSet<LabPrivilege>());
		if(null != userId){
			for(String userId: userId.split(",")){
				Employee e = employeeService.getEmployeeById(Long.parseLong(userId.trim()));
				role.getUsers().add(e);
			}
		}
		if(null != privilegeId){
			for(String pId: privilegeId.split(",")){
				role.getPrivileges().add(privilegeService.getById(Long.parseLong(pId.trim())));
			}
		}
		
		roleService.add(role);
		return "toList";
	}

	public String delete() {
		roleService.delete(role);
		return "toList";
	}

	public String update() {
		role.setUsers(new HashSet<Employee>());
		role.setPrivileges(new HashSet<LabPrivilege>());
		if(null != userId){
			for(String userId: userId.split(",")){
				Employee e = employeeService.getEmployeeById(Long.parseLong(userId.trim()));
				role.getUsers().add(e);
			}
		}
		if(null != privilegeId){
			for(String pId: privilegeId.split(",")){
				role.getPrivileges().add(privilegeService.getById(Long.parseLong(pId.trim())));
			}
		}
		roleService.update(role);
		return "toList";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toEdit() {
		role = roleService.getById(role.getId());
		ValueContext.putValueStack(role);
		return "toEdit";
	}

	public String list() {
		ValueContext.putValueContext("list", roleService.list());
		return "list";
	}
	
	public String showUsers(){
		role = roleService.getById(role.getId());
		if(null!=role.getUsers() && role.getUsers().size()>0){
			List<Employee> list  = new ArrayList<Employee>(role.getUsers());
			ValueContext.putValueContext("list", list);
		}
		return "toUserList";
	}

	@Override
	public LabRole getModel() {
		return role;
	}

	public LabRole getRole() {
		return role;
	}

	public void setRole(LabRole role) {
		this.role = role;
	}

	public ILabRoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(ILabRoleService roleService) {
		this.roleService = roleService;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}

	public ILabPrivilegeService getPrivilegeService() {
		return privilegeService;
	}

	public void setPrivilegeService(ILabPrivilegeService privilegeService) {
		this.privilegeService = privilegeService;
	}



}
