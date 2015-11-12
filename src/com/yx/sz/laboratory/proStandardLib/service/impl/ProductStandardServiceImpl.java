package com.yx.sz.laboratory.proStandardLib.service.impl;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;
import com.yx.sz.laboratory.proStandardLib.dao.IProductStandardDao;
import com.yx.sz.laboratory.proStandardLib.service.IProductStandardService;

public class ProductStandardServiceImpl implements IProductStandardService {

	
	private IProductStandardDao psDao;
	@Override
	public List<FoodStandard> getAllProductStandard() {
		return psDao.getAll();
	}
	public IProductStandardDao getPsDao() {
		return psDao;
	}
	public void setPsDao(IProductStandardDao psDao) {
		this.psDao = psDao;
	}
	@Override
	public FoodStandard getById(FoodStandard productStandard) {
		return psDao.getById(productStandard.getId());
	}
	@Override
	public void save(FoodStandard productStandard) {
		psDao.save(productStandard);
	}
	@Override
	public void update(FoodStandard productStandard) {
		psDao.update(productStandard);
	}
	@Override
	public void delete(FoodStandard productStandard) {
		psDao.delete(productStandard);
	}

	
}
