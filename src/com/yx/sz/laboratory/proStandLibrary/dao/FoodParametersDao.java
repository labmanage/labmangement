package com.yx.sz.laboratory.proStandLibrary.dao;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.FoodParameters;

public interface FoodParametersDao {
	
	public void updaFoodParameters(FoodParameters foodParameters);
	
	public void saveFoodParameters(FoodParameters foodParameters);
	
	public void delFoodParameters(FoodParameters foodParameters);
		
	public FoodParameters getFoodParametersById(int id);
	
	public List getFoodParametersList();

}
