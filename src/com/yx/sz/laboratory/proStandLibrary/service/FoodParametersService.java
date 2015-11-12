package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.FoodParameters;

public interface FoodParametersService {

	public void updateFoodParameters(FoodParameters foodParameters);
	
	public void saveFoodParameters(FoodParameters foodParameters);
	
	public void delFoodParameters(FoodParameters foodParameters);
	
	public List getFoodParametersByprocDefinitionId();
	
	public FoodParameters getFoodParametersById(int id);

}
