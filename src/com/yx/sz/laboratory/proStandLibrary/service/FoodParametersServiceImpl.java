package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.FoodParameters;
import com.yx.sz.laboratory.proStandLibrary.dao.FoodParametersDao;

public class FoodParametersServiceImpl implements FoodParametersService {

	private FoodParametersDao foodParametersDao ;

	@Override
	public void updateFoodParameters(FoodParameters foodParameters) {
		this.foodParametersDao.updaFoodParameters(foodParameters);
	}

	@Override
	public void saveFoodParameters(FoodParameters foodParameters) {
		this.foodParametersDao.saveFoodParameters(foodParameters);
	}

	@Override
	public void delFoodParameters(FoodParameters foodParameters) {
		this.foodParametersDao.delFoodParameters(foodParameters);
	}

	@Override
	public List getFoodParametersByprocDefinitionId() {
		List list = this.foodParametersDao.getFoodParametersList();
		return list;
	}

	@Override
	public FoodParameters getFoodParametersById(int id) {
		FoodParameters foodParameters = this.foodParametersDao.getFoodParametersById(id);
		return foodParameters;
	}

	public FoodParametersDao getFoodParametersDao() {
		return foodParametersDao;
	}

	public void setFoodParametersDao(FoodParametersDao foodParametersDao) {
		this.foodParametersDao = foodParametersDao;
	}

}
