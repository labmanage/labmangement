package com.yx.sz.laboratory.organization.action;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.organization.service.ILabPrivilegeService;

public class PrivilegeAction implements ModelDriven<LabPrivilege> {
	private LabPrivilege privilege = new LabPrivilege();
	private ILabPrivilegeService privilegeService;

	public String add() {
		privilegeService.add(privilege);
		return "toList";
	}

	public String update() {
		privilegeService.update(privilege);
		return "toList";
	}

	public String delete() {
		privilegeService.delete(privilege);
		return "toList";
	}

	public String list() {
		ValueContext.putValueContext("list", privilegeService.list());
		return "list";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toEdit() {
		privilege = privilegeService.getById(privilege.getId());
		return "toEdit";
	}

	public String showRoles(){
		privilege = privilegeService.getById(privilege.getId());
		if(null != privilege.getRoles() && privilege.getRoles().size()>0){
			List<LabRole> list = new ArrayList<LabRole>(privilege.getRoles());
			ValueContext.putValueContext("list", list);
		}
		return "toRoleList";
	}
	
	@Override
	public LabPrivilege getModel() {
		return privilege;
	}

	public LabPrivilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(LabPrivilege privilege) {
		this.privilege = privilege;
	}

	public ILabPrivilegeService getPrivilegeService() {
		return privilegeService;
	}

	public void setPrivilegeService(ILabPrivilegeService privilegeService) {
		this.privilegeService = privilegeService;
	}

}
