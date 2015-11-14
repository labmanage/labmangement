package com.yx.sz.laboratory.workflow.service.impl;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.CattleSampleList;
import com.yx.sz.laboratory.workflow.dao.ICattleSampleListDao;
import com.yx.sz.laboratory.workflow.service.ICattleSampleListService;

public class CattleSampleListServiceImpl implements ICattleSampleListService{

	private ICattleSampleListDao cattleDao;
	@Override
	public List<CattleSampleList> list() {
		
		return cattleDao.list();
	}

	@Override
	public CattleSampleList findById(long id) {
		return cattleDao.getById(id);
	}

	@Override
	public void save(CattleSampleList sl) {
		cattleDao.save(sl);
	}

	@Override
	public void delete(CattleSampleList sl) {
		cattleDao.delete(sl);
	}

	@Override
	public void update(CattleSampleList sl) {
		cattleDao.update(sl);
	}

	public ICattleSampleListDao getCattleDao() {
		return cattleDao;
	}

	public void setCattleDao(ICattleSampleListDao cattleDao) {
		this.cattleDao = cattleDao;
	}

}
