package com.yx.sz.laboratory.workflow.service.impl;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.ForestFoodSampleList;
import com.yx.sz.laboratory.workflow.dao.IForestFoodSampleListDao;
import com.yx.sz.laboratory.workflow.service.IForestFoodSampleListService;

public class ForestFoodSampleListServiceImpl implements IForestFoodSampleListService{

	private IForestFoodSampleListDao forestDao;
	@Override
	public List<ForestFoodSampleList> list() {
		
		return forestDao.list();
	}

	@Override
	public ForestFoodSampleList findById(long id) {
		return forestDao.getById(id);
	}

	@Override
	public void save(ForestFoodSampleList sl) {
		forestDao.save(sl);
	}

	@Override
	public void delete(ForestFoodSampleList sl) {
		forestDao.delete(sl);
	}

	@Override
	public void update(ForestFoodSampleList sl) {
		forestDao.update(sl);
	}

	public IForestFoodSampleListDao getForestDao() {
		return forestDao;
	}

	public void setForestDao(IForestFoodSampleListDao forestDao) {
		this.forestDao = forestDao;
	}

}
