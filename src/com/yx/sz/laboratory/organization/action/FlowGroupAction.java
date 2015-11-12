package com.yx.sz.laboratory.organization.action;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.organization.bean.LabFlowGroup;
import com.yx.sz.laboratory.organization.bean.LabGroupUser;
import com.yx.sz.laboratory.organization.service.ILabFlowGroupService;

public class FlowGroupAction implements ModelDriven<LabFlowGroup>{
	private LabFlowGroup flowGroup = new LabFlowGroup();
	private ILabFlowGroupService flowGroupService;

	public String list(){
		ValueContext.putValueContext("list", flowGroupService.list());
		return "list";
	}
	
	public String toAdd(){return "toAdd";}
	
	public String toEdit(){
		flowGroup = flowGroupService.getById(flowGroup.getId());
		return "toEdit";
	}
	
	public String delete(){
		flowGroupService.delete(flowGroup);
		return "toList";
	}
	
	public String update(){
		flowGroupService.update(flowGroup);
		return "toList";
	}
	public String add(){
		flowGroupService.add(flowGroup);
		return "toList";
	}

	public String showUsers(){
		if(null != flowGroup.getUsers() && flowGroup.getUsers().size() > 0){
			List<LabGroupUser> list = new ArrayList();
			ValueContext.putValueContext("list", list);
		}
		
		return "toUserList";
	}
	
	@Override
	public LabFlowGroup getModel() {
		return flowGroup;
	}

	public LabFlowGroup getFlowGroup() {
		return flowGroup;
	}

	public void setFlowGroup(LabFlowGroup flowGroup) {
		this.flowGroup = flowGroup;
	}




	public ILabFlowGroupService getFlowGroupService() {
		return flowGroupService;
	}




	public void setFlowGroupService(ILabFlowGroupService flowGroupService) {
		this.flowGroupService = flowGroupService;
	}

}
