package com.yx.sz.laboratory.proStandardLib.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParamAndEquipment;

public interface INonFoodParamAndEquipmentDao {
	public void save(NonFoodParamAndEquipment fd);
	public void batchSave(List<NonFoodParamAndEquipment> list);
	public void delete(NonFoodParamAndEquipment fd);
	public void update(NonFoodParamAndEquipment fd);
	public NonFoodParamAndEquipment getById(int id);
	public List<NonFoodParamAndEquipment> getAll();
	public List<NonFoodParamAndEquipment> getTopAll();
	public List<NonFoodParamAndEquipment> getByTop(NonFoodParamAndEquipment nfpe);
}
