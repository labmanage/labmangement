package com.yx.sz.laboratory.proStandardLib.service.impl;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.dao.IFoodParamAndEquipmentDao;
import com.yx.sz.laboratory.proStandardLib.service.FoodParamAndEquipmentService;

public class FoodParamAndEquipmentServiceImpl implements FoodParamAndEquipmentService{

	private IFoodParamAndEquipmentDao fpeDao;
	
	@Override
	public List<FoodParamAndEquipment> getAll() {
		return fpeDao.getAll();
	}

	public IFoodParamAndEquipmentDao getFpeDao() {
		return fpeDao;
	}

	public void setFpeDao(IFoodParamAndEquipmentDao fpeDao) {
		this.fpeDao = fpeDao;
	}

	@Override
	public List<FoodParamAndEquipment> getTopAll() {
		return fpeDao.getTop();
	}

	@Override
	public List<FoodParamAndEquipment> getByTop(FoodParamAndEquipment fpe) {
		return fpeDao.getByTop(fpe);
	}

	@Override
	public void delete(FoodParamAndEquipment fd) {
		fpeDao.delete(fd);
	}

	@Override
	public void update(FoodParamAndEquipment fd) {
		fpeDao.update(fd);
	}

	@Override
	public FoodParamAndEquipment getById(int id) {
		return fpeDao.getById(id);
	}

	@Override
	public void save(FoodParamAndEquipment fd) {
		fpeDao.save(fd);
	}

	@Override
	public List<FoodParamAndEquipment> getSubItemsByProductName(String productName) {
		return fpeDao.getSubItemsByProductName(productName);
	}

}
