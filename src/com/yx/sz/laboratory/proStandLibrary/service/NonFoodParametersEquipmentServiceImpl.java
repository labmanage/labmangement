package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParametersEquipment;
import com.yx.sz.laboratory.proStandLibrary.dao.NonFoodParametersEquipmentDao;

public class NonFoodParametersEquipmentServiceImpl implements NonFoodParametersEquipmentService {

	private NonFoodParametersEquipmentDao nonFoodParametersEquipmentDao ;

	@Override
	public void updateNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment) {
		this.nonFoodParametersEquipmentDao.updaNonFoodParametersEquipment(nonFoodParametersEquipment);
	}

	@Override
	public void saveNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment) {
		this.nonFoodParametersEquipmentDao.saveNonFoodParametersEquipment(nonFoodParametersEquipment);
	}

	@Override
	public void delNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment) {
		this.nonFoodParametersEquipmentDao.delNonFoodParametersEquipment(nonFoodParametersEquipment);
	}

	@Override
	public List getNonFoodParametersEquipmentByprocDefinitionId() {
		List list = this.nonFoodParametersEquipmentDao.getNonFoodParametersEquipmentList();
		return list;
	}

	@Override
	public NonFoodParametersEquipment getNonFoodParametersEquipmentById(int id) {
		NonFoodParametersEquipment nonFoodParametersEquipment = this.nonFoodParametersEquipmentDao.getNonFoodParametersEquipmentById(id);
		return nonFoodParametersEquipment;
	}

	public NonFoodParametersEquipmentDao getNonFoodParametersEquipmentDao() {
		return nonFoodParametersEquipmentDao;
	}

	public void setNonFoodParametersEquipmentDao(
			NonFoodParametersEquipmentDao nonFoodParametersEquipmentDao) {
		this.nonFoodParametersEquipmentDao = nonFoodParametersEquipmentDao;
	}

}
