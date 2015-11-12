package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandLibrary.bean.ProductStandard;
import com.yx.sz.laboratory.proStandLibrary.service.ProductStandardService;
import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;
import com.yx.sz.laboratory.proStandardLib.service.IProductStandardService;

public class ProductStandardAction implements ModelDriven<FoodStandard> {

	FoodStandard productStandard = new FoodStandard();
	
	private IProductStandardService productStandardService;
	
	List list = new ArrayList();
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.productStandardService.getAllProductStandard();
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
		this.productStandardService.save(productStandard);		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		productStandard = this.productStandardService.getById(productStandard);
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.productStandardService.update(productStandard);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.productStandardService.delete(productStandard);	
		return "delete";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}

	

	public FoodStandard getProductStandard() {
		return productStandard;
	}

	public void setProductStandard(FoodStandard productStandard) {
		this.productStandard = productStandard;
	}

	public IProductStandardService getProductStandardService() {
		return productStandardService;
	}

	public void setProductStandardService(
			IProductStandardService productStandardService) {
		this.productStandardService = productStandardService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public FoodStandard getModel() {
		return productStandard;
	}

}
