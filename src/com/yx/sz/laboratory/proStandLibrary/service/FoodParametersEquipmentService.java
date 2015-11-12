package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.FoodParametersEquipment;

public interface FoodParametersEquipmentService {

	public void updateFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment);
	
	public void saveFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment);
	
	public void delFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment);
	
	public List getFoodParametersEquipmentByprocDefinitionId();
	
	public FoodParametersEquipment getFoodParametersEquipmentById(int id);
	
	public List getFoodParametersEquipmentByChanpinMc(String chanpinMc);


}
