package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParameters;
import com.yx.sz.laboratory.proStandLibrary.service.NonFoodParametersService;
import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParam;
import com.yx.sz.laboratory.proStandardLib.service.NonFoodParamService;

public class NonFoodParametersAction implements ModelDriven<NonFoodParam> {

	NonFoodParam nonFoodParameters = new NonFoodParam();
	
	private NonFoodParamService nonFoodParametersService;
	
	List list = new ArrayList();
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.nonFoodParametersService.getAll();
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
		this.nonFoodParametersService.save(nonFoodParameters);		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		nonFoodParameters = this.nonFoodParametersService.getById(nonFoodParameters.getId());	
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.nonFoodParametersService.update(nonFoodParameters);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.nonFoodParametersService.delete(nonFoodParameters);	
		return "delete";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}
	
	

	public NonFoodParam getNonFoodParameters() {
		return nonFoodParameters;
	}

	public void setNonFoodParameters(NonFoodParam nonFoodParameters) {
		this.nonFoodParameters = nonFoodParameters;
	}

	public NonFoodParamService getNonFoodParametersService() {
		return nonFoodParametersService;
	}

	public void setNonFoodParametersService(
			NonFoodParamService nonFoodParametersService) {
		this.nonFoodParametersService = nonFoodParametersService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public NonFoodParam getModel() {
		return nonFoodParameters;
	}

}
