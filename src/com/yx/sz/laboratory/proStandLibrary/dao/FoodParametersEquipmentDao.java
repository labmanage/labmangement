package com.yx.sz.laboratory.proStandLibrary.dao;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.FoodParametersEquipment;

public interface FoodParametersEquipmentDao {
	
	public void updaFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment);
	
	public void saveFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment);
	
	public void delFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment);
		
	public FoodParametersEquipment getFoodParametersEquipmentById(int id);
	
	public List getFoodParametersEquipmentList();
	
	public List getFoodParametersEquipmentByChanpinMc(String chanpinMc);

}
