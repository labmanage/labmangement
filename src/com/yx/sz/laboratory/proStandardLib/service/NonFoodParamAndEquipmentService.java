package com.yx.sz.laboratory.proStandardLib.service;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParamAndEquipment;

public interface NonFoodParamAndEquipmentService {
	public List<NonFoodParamAndEquipment> getAll();
	public List<NonFoodParamAndEquipment> getTopAll();
	public List<NonFoodParamAndEquipment> getByTop(NonFoodParamAndEquipment nfpe);
	public void save(NonFoodParamAndEquipment nonFoodParametersEquipment);
	public NonFoodParamAndEquipment getById(int id);
	public void update(NonFoodParamAndEquipment nonFoodParametersEquipment);
	public void delete(NonFoodParamAndEquipment nonFoodParametersEquipment);
}
