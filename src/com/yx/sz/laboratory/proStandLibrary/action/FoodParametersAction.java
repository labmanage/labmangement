package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParam;
import com.yx.sz.laboratory.proStandardLib.service.IFoodParamService;


public class FoodParametersAction implements ModelDriven<FoodParam> {

	FoodParam foodParameters = new FoodParam();
	
	private IFoodParamService foodParametersService;
	
	List list = new ArrayList();
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.foodParametersService.getTop();
		ValueContext.putValueContext("list", list);
		return "showList";
	}
	
	public String showSubList(){
		list = this.foodParametersService.getByTop(foodParameters);
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
		this.foodParametersService.save(foodParameters);		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		foodParameters = this.foodParametersService.getById(foodParameters.getId());	
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.foodParametersService.update(foodParameters);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.foodParametersService.delete(foodParameters);	
		return "delete";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}

	

	public FoodParam getFoodParameters() {
		return foodParameters;
	}

	public void setFoodParameters(FoodParam foodParameters) {
		this.foodParameters = foodParameters;
	}

	public IFoodParamService getFoodParametersService() {
		return foodParametersService;
	}

	public void setFoodParametersService(IFoodParamService foodParametersService) {
		this.foodParametersService = foodParametersService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public FoodParam getModel() {
		return foodParameters;
	}

}
