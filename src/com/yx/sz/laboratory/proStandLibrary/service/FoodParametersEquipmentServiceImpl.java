package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.FoodParametersEquipment;
import com.yx.sz.laboratory.proStandLibrary.dao.FoodParametersEquipmentDao;

public class FoodParametersEquipmentServiceImpl implements FoodParametersEquipmentService {

	private FoodParametersEquipmentDao foodParametersEquipmentDao ;

	@Override
	public void updateFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment) {
		this.foodParametersEquipmentDao.updaFoodParametersEquipment(foodParametersEquipment);
	}

	@Override
	public void saveFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment) {
		this.foodParametersEquipmentDao.saveFoodParametersEquipment(foodParametersEquipment);
	}

	@Override
	public void delFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment) {
		this.foodParametersEquipmentDao.delFoodParametersEquipment(foodParametersEquipment);
	}

	@Override
	public List getFoodParametersEquipmentByprocDefinitionId() {
		List list = this.foodParametersEquipmentDao.getFoodParametersEquipmentList();
		return list;
	}

	@Override
	public FoodParametersEquipment getFoodParametersEquipmentById(int id) {
		FoodParametersEquipment foodParametersEquipment = this.foodParametersEquipmentDao.getFoodParametersEquipmentById(id);
		return foodParametersEquipment;
	}
	
	@Override
	public List getFoodParametersEquipmentByChanpinMc(String chanpinMc) {
		
		List<FoodParametersEquipment> list = this.foodParametersEquipmentDao.getFoodParametersEquipmentByChanpinMc(chanpinMc);
		
		return list;
	}

	public FoodParametersEquipmentDao getFoodParametersEquipmentDao() {
		return foodParametersEquipmentDao;
	}

	public void setFoodParametersEquipmentDao(
			FoodParametersEquipmentDao foodParametersEquipmentDao) {
		this.foodParametersEquipmentDao = foodParametersEquipmentDao;
	}



}
