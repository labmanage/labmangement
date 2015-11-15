package com.yx.sz.laboratory.organization.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.organization.bean.LabGroupUser;
import com.yx.sz.laboratory.organization.service.ILabGroupUserRuleService;

public class LabGroupUserRuleAction implements ModelDriven<LabGroupUser> {

	LabGroupUser labGroupUser = new LabGroupUser();
	
	private ILabGroupUserRuleService labGroupUserRuleservice;
	
	List<LabGroupUser> list = new ArrayList<LabGroupUser>();
	
	/**
	 * 列表
	 */
	public String showList(){
		
		list = this.labGroupUserRuleservice.getLabGroupUserByprocDefinitionId();
		for(LabGroupUser u: list){
			if(null != u.getProcessDefinitionName()){
				switch(u.getProcessDefinitionName()){
				case "CattleSampleList":
					u.setProcessDefinitionName("畜产品抽样单流程");
					break;
				case "ForestFoodSampleList":
					u.setProcessDefinitionName("林业产品抽样单流程");
					break;
				case "PollutionFreeSampleList":
					u.setProcessDefinitionName("无公害产品抽样单流程");
					break;
				case "QualitySampleList":
					u.setProcessDefinitionName("食品质检中心抽样单流程");
					break;
				case "SampleList":
					u.setProcessDefinitionName("抽样单流程");
					break;
					default:
						break;
				}
			}
			
		}
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
		List<String> taskList = new ArrayList<String>();
		taskList.add("收样确认");
		taskList.add("检验接受");
		taskList.add("样品领取");
		taskList.add("分配任务");
		taskList.add("任务接收检验");
		taskList.add("领导审核");
		taskList.add("登记结果");
		taskList.add("结果审核");
		taskList.add("样品归还");
		taskList.add("编制检验报告");
		taskList.add("报告审核");
		taskList.add("报告批准");
		taskList.add("打印报告盖章");
		taskList.add("报告发送");
		taskList.add("报告归档");
		taskList.add("检验结束");
		taskList.add("抱怨处理");
		
		ValueContext.putValueContext("taskList", taskList);
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

	public List<LabGroupUser> getList() {
		return list;
	}

	public void setList(List<LabGroupUser> list) {
		this.list = list;
	}

	

}
