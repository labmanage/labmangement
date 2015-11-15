package com.yx.sz.laboratory.organization.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import org.apache.struts2.ServletActionContext;

import cn.itcast.ssh.service.IEmployeeService;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.organization.bean.SearchBean;
import com.yx.sz.laboratory.organization.service.ILabPrivilegeService;
import com.yx.sz.laboratory.util.SessionContext;

public class UserAction implements ModelDriven<SearchBean>{
	SearchBean sBean = new SearchBean();
	private IEmployeeService employeeService;
	private ILabPrivilegeService privilegeService;
	private boolean hasPrivilege = false;

	public void checkHasPrivilege(){
		PrintWriter writer = null;
		try {
			writer = ServletActionContext.getResponse().getWriter();
			String returnUrl = "checkPrivilege";
			if(null == SessionContext.getAllPrivileges()){
				SessionContext.putAllPrivileges(privilegeService.list());
			}
			boolean actionExistInAll = false;
			List<LabPrivilege> allPrivilege = SessionContext.getAllPrivileges();
			for(LabPrivilege p : allPrivilege){
				if(p.getUrl().equals(sBean.getAction())){
					actionExistInAll = true;
				}
			}
			if(!actionExistInAll){
				hasPrivilege = true;
			}else{
				LabRole role = SessionContext.get().getRole();
				if(null != role){
					Set<LabPrivilege> userPrivileges = role.getPrivileges();
					for(LabPrivilege p: userPrivileges){
						if(p.getUrl().equals(sBean.getAction())){
							hasPrivilege = true;
						}
					}
				}
			}
			
			writer.print(hasPrivilege);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=writer){
				writer.flush();
				writer.close();
			}
		}
	}
	
	@Override
	public SearchBean getModel() {
		return sBean;
	}
	public SearchBean getsBean() {
		return sBean;
	}

	public void setsBean(SearchBean sBean) {
		this.sBean = sBean;
	}

	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public ILabPrivilegeService getPrivilegeService() {
		return privilegeService;
	}
	public void setPrivilegeService(ILabPrivilegeService privilegeService) {
		this.privilegeService = privilegeService;
	}

	public boolean isHasPrivilege() {
		return hasPrivilege;
	}

	public void setHasPrivilege(boolean hasPrivilege) {
		this.hasPrivilege = hasPrivilege;
	}

	
}
