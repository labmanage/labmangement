package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParametersEquipment;
import com.yx.sz.laboratory.proStandLibrary.service.NonFoodParametersEquipmentService;
import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.service.NonFoodParamAndEquipmentService;

public class NonFoodParametersEquipmentAction implements ModelDriven<NonFoodParamAndEquipment> {

	NonFoodParamAndEquipment nonFoodParametersEquipment = new NonFoodParamAndEquipment();
	
	private NonFoodParamAndEquipmentService nonFoodParametersEquipmentService;
	
	List list = new ArrayList();
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.nonFoodParametersEquipmentService.getAll();
		ValueContext.putValueContext("list", list);
		return "showList";
	}
	
	public String showSubList(){
		list = this.nonFoodParametersEquipmentService.getByTop(nonFoodParametersEquipment);
		ValueContext.putValueContext("list", list);
		return "showList";
	}
	
	/**
	 * 跳转
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public String toInputPage() throws UnsupportedEncodingException{
		return "toInputPage";
	}
	
	/**
	 * 保存数据
	 * @return
	 */
	public String save(){		
		this.nonFoodParametersEquipmentService.save(nonFoodParametersEquipment);		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		nonFoodParametersEquipment = this.nonFoodParametersEquipmentService.getById(nonFoodParametersEquipment.getId());	
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.nonFoodParametersEquipmentService.update(nonFoodParametersEquipment);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.nonFoodParametersEquipmentService.delete(nonFoodParametersEquipment);	
		return "delete";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}

	

	public NonFoodParamAndEquipment getNonFoodParametersEquipment() {
		return nonFoodParametersEquipment;
	}

	public void setNonFoodParametersEquipment(
			NonFoodParamAndEquipment nonFoodParametersEquipment) {
		this.nonFoodParametersEquipment = nonFoodParametersEquipment;
	}

	public NonFoodParamAndEquipmentService getNonFoodParametersEquipmentService() {
		return nonFoodParametersEquipmentService;
	}

	public void setNonFoodParametersEquipmentService(
			NonFoodParamAndEquipmentService nonFoodParametersEquipmentService) {
		this.nonFoodParametersEquipmentService = nonFoodParametersEquipmentService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public NonFoodParamAndEquipment getModel() {
		return nonFoodParametersEquipment;
	}

}
