package com.yx.sz.laboratory.proStandardLib.service.impl;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParam;
import com.yx.sz.laboratory.proStandardLib.dao.IFoodParamDao;
import com.yx.sz.laboratory.proStandardLib.service.IFoodParamService;

public class FoodParamServiceImpl implements IFoodParamService{
	private IFoodParamDao fpDao;

	@Override
	public List<FoodParam> getAll() {
		return fpDao.getAll();
	}

	
	
	
	public IFoodParamDao getFpDao() {
		return fpDao;
	}

	public void setFpDao(IFoodParamDao fpDao) {
		this.fpDao = fpDao;
	}




	@Override
	public List<FoodParam> getTop() {
		return fpDao.getTop();
	}




	@Override
	public List<FoodParam> getByTop(FoodParam fp) {
		return fpDao.getByTop(fp);
	}




	@Override
	public void save(FoodParam fd) {
		fpDao.save(fd);
	}




	@Override
	public FoodParam getById(int id) {
		return fpDao.getById(id);
	}




	@Override
	public void update(FoodParam fd) {
		fpDao.update(fd);
	}




	@Override
	public void delete(FoodParam fd) {
		fpDao.delete(fd);
	}

	
}
