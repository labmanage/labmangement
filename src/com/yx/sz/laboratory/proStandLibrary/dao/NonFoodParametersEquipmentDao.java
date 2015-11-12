package com.yx.sz.laboratory.proStandLibrary.dao;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParametersEquipment;

public interface NonFoodParametersEquipmentDao {
	
	public void updaNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment);
	
	public void saveNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment);
	
	public void delNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment);
		
	public NonFoodParametersEquipment getNonFoodParametersEquipmentById(int id);
	
	public List getNonFoodParametersEquipmentList();

}
