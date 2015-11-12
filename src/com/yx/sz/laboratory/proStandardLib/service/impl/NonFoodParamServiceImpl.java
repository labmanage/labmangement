package com.yx.sz.laboratory.proStandardLib.service.impl;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParam;
import com.yx.sz.laboratory.proStandardLib.dao.INonFoodParamDao;
import com.yx.sz.laboratory.proStandardLib.service.NonFoodParamService;

public class NonFoodParamServiceImpl implements NonFoodParamService{

	private INonFoodParamDao nfpDao;
	
	@Override
	public List<NonFoodParam> getAll() {
		return nfpDao.getAll();
	}

	public INonFoodParamDao getNfpDao() {
		return nfpDao;
	}

	public void setNfpDao(INonFoodParamDao nfpDao) {
		this.nfpDao = nfpDao;
	}

	@Override
	public void save(NonFoodParam fd) {
		nfpDao.save(fd);
	}

	@Override
	public NonFoodParam getById(int id) {
		return nfpDao.getById(id);
	}

	@Override
	public void update(NonFoodParam fd) {
		nfpDao.update(fd);
	}

	@Override
	public void delete(NonFoodParam fd) {
		nfpDao.delete(fd);
	}

	
}
