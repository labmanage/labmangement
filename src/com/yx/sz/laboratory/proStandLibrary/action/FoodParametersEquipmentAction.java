package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandLibrary.service.FoodParametersEquipmentService;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.service.FoodParamAndEquipmentService;

public class FoodParametersEquipmentAction implements ModelDriven<FoodParamAndEquipment> {

	FoodParamAndEquipment foodParametersEquipment = new FoodParamAndEquipment();
	
	private FoodParamAndEquipmentService foodParametersEquipmentService;
	
	List list = new ArrayList();
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.foodParametersEquipmentService.getTopAll();
		ValueContext.putValueContext("list", list);
		return "showList";
	}
	
	public String showSubList(){
		list = this.foodParametersEquipmentService.getByTop(foodParametersEquipment);
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
		this.foodParametersEquipmentService.save(foodParametersEquipment);		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		foodParametersEquipment = this.foodParametersEquipmentService.getById(foodParametersEquipment.getId());	
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.foodParametersEquipmentService.update(foodParametersEquipment);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.foodParametersEquipmentService.delete(foodParametersEquipment);	
		return "delete";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}

	
	

	public FoodParamAndEquipmentService getFoodParametersEquipmentService() {
		return foodParametersEquipmentService;
	}

	public void setFoodParametersEquipmentService(
			FoodParamAndEquipmentService foodParametersEquipmentService) {
		this.foodParametersEquipmentService = foodParametersEquipmentService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public FoodParamAndEquipment getFoodParametersEquipment() {
		return foodParametersEquipment;
	}

	public void setFoodParametersEquipment(
			FoodParamAndEquipment foodParametersEquipment) {
		this.foodParametersEquipment = foodParametersEquipment;
	}

	@Override
	public FoodParamAndEquipment getModel() {
		return foodParametersEquipment;
	}

}
