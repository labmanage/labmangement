package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParameters;

public interface NonFoodParametersService {

	public void updateNonFoodParameters(NonFoodParameters nonFoodParameters);
	
	public void saveNonFoodParameters(NonFoodParameters nonFoodParameters);
	
	public void delNonFoodParameters(NonFoodParameters nonFoodParameters);
	
	public List getNonFoodParametersByprocDefinitionId();
	
	public NonFoodParameters getNonFoodParametersById(int id);

}
