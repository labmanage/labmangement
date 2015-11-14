package com.yx.sz.laboratory.workflow.service.impl;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.QualitySampleList;
import com.yx.sz.laboratory.workflow.dao.IQualitySampleListDao;
import com.yx.sz.laboratory.workflow.service.IQualitySampleListService;

public class QualitySampleListServiceImpl implements IQualitySampleListService{
	
	private IQualitySampleListDao qualityDao;

	@Override
	public List<QualitySampleList> list() {
		return qualityDao.list();
	}

	@Override
	public QualitySampleList findById(long id) {
		return qualityDao.getById(id);
	}

	@Override
	public void save(QualitySampleList sl) {
		qualityDao.save(sl);
	}

	@Override
	public void delete(QualitySampleList sl) {
		qualityDao.delete(sl);
	}

	@Override
	public void update(QualitySampleList sl) {
		qualityDao.update(sl);
	}

	public IQualitySampleListDao getQualityDao() {
		return qualityDao;
	}

	public void setQualityDao(IQualitySampleListDao qualityDao) {
		this.qualityDao = qualityDao;
	}

}
