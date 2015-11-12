package com.yx.sz.laboratory.organization.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.organization.bean.LabGroupUser;
import com.yx.sz.laboratory.organization.service.ILabGroupUserRuleService;

public class LabGroupUserRuleAction implements ModelDriven<LabGroupUser> {

	LabGroupUser labGroupUser = new LabGroupUser();
	
	private ILabGroupUserRuleService labGroupUserRuleservice;
	
	List list = new ArrayList();
	
	/**
	 * 列表
	 */
	public String showList(){
		
		list = this.labGroupUserRuleservice.getLabGroupUserByprocDefinitionId();
		ValueContext.putValueContext("list", list);
		return "showList";
	}
	
	/**
	 * 跳转
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public String toInputPage() throws UnsupportedEncodingException{
		
		//labGroupUser.setProcInstanceName(URLDecoder.decode(labGroupUser.getProcInstanceName(), "UTF-8"));
		
		String procDefinitionName = new String (labGroupUser.getProcessDefinitionName().getBytes("ISO8859-1"), "utf-8");
		
		System.out.println(procDefinitionName);
		
		labGroupUser.setProcessDefinitionName(procDefinitionName);
		
		return "toInputPage";
	}
	
	/**
	 * 保存数据
	 * @return
	 */
	public String save(){
		
		this.labGroupUserRuleservice.saveLabGroupUser(labGroupUser);
		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		
		labGroupUser = this.labGroupUserRuleservice.getLabGroupUserById(labGroupUser.getId());
		
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){
		
		this.labGroupUserRuleservice.updateLabGroupUser(labGroupUser);
		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		
		this.labGroupUserRuleservice.delLabGroupUser(labGroupUser);
		
		return "delete";
	}
	
	public String toFindPage(){
		
		
		return "toFindPage";
	}
	
	public String find(){
		
		return "find";
	}
	
	
	
	@Override
	public LabGroupUser getModel() {
		return labGroupUser;
	}


	public LabGroupUser getLabGroupUser() {
		return labGroupUser;
	}


	public void setLabGroupUser(LabGroupUser labGroupUser) {
		this.labGroupUser = labGroupUser;
	}

	public ILabGroupUserRuleService getLabGroupUserRuleservice() {
		return labGroupUserRuleservice;
	}

	public void setLabGroupUserRuleservice(
			ILabGroupUserRuleService labGroupUserRuleservice) {
		this.labGroupUserRuleservice = labGroupUserRuleservice;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

}
