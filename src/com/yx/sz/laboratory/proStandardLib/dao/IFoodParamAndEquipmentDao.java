package com.yx.sz.laboratory.proStandardLib.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;


public interface IFoodParamAndEquipmentDao {
	public void save(FoodParamAndEquipment fd);
	public void batchSave(List<FoodParamAndEquipment> list);
	public void delete(FoodParamAndEquipment fd);
	public void update(FoodParamAndEquipment fd);
	public FoodParamAndEquipment getById(int id);
	public List<FoodParamAndEquipment> getAll();
	public List<FoodParamAndEquipment> getTop();
	public List<FoodParamAndEquipment> getByTop(FoodParamAndEquipment fpe);
	/**
	 * 根据产品名称查询需要检测的属性
	 * @param sampleName
	 * @return
	 */
	public List<FoodParamAndEquipment> getSubItemsByProductName(String productName);
}
