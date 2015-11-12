package com.yx.sz.laboratory.proStandLibrary.dao;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParameters;

public interface NonFoodParametersDao {
	
	public void updaNonFoodParameters(NonFoodParameters nonFoodParameters);
	
	public void saveNonFoodParameters(NonFoodParameters nonFoodParameters);
	
	public void delNonFoodParameters(NonFoodParameters nonFoodParameters);
		
	public NonFoodParameters getNonFoodParametersById(int id);
	
	public List getNonFoodParametersList();

}
