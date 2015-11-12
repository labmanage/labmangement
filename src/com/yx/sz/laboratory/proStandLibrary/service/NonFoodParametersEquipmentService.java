package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParametersEquipment;

public interface NonFoodParametersEquipmentService {

	public void updateNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment);
	
	public void saveNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment);
	
	public void delNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment);
	
	public List getNonFoodParametersEquipmentByprocDefinitionId();
	
	public NonFoodParametersEquipment getNonFoodParametersEquipmentById(int id);

}
