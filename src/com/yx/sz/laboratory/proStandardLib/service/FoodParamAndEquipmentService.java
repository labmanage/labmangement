package com.yx.sz.laboratory.proStandardLib.service;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;

public interface FoodParamAndEquipmentService {
	public List<FoodParamAndEquipment> getAll();
	public List<FoodParamAndEquipment> getTopAll();
	public List<FoodParamAndEquipment> getByTop(FoodParamAndEquipment fpe);
	public void delete(FoodParamAndEquipment foodParametersEquipment);
	public void update(FoodParamAndEquipment foodParametersEquipment);
	public FoodParamAndEquipment getById(int id);
	public void save(FoodParamAndEquipment foodParametersEquipment);
	/*
	 * 根据产品ID查询列表
	 * 
	 */
	public List<FoodParamAndEquipment> getSubItemsByProductName(String productName);
}
