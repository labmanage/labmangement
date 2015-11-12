package com.yx.sz.laboratory.organization.action;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.organization.bean.LabGroupUser;
import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.organization.service.ILabRoleService;

public class RoleAction implements ModelDriven<LabRole> {

	private LabRole role = new LabRole();
	private ILabRoleService roleService;

	public String add() {
		roleService.add(role);
		return "toList";
	}

	public String delete() {
		roleService.delete(role);
		return "toList";
	}

	public String update() {
		roleService.update(role);
		return "toList";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toEdit() {
		role = roleService.getById(role.getId());
		return "toEdit";
	}

	public String list() {
		ValueContext.putValueContext("list", roleService.list());
		return "list";
	}
	
	public String showUsers(){
		if(null!=role.getUsers() && role.getUsers().size()>0){
			List<LabGroupUser> list  = new ArrayList<LabGroupUser>(role.getUsers());
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



}
