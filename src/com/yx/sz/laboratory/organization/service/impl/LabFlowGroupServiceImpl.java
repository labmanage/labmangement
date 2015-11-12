package com.yx.sz.laboratory.organization.service.impl;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabFlowGroup;
import com.yx.sz.laboratory.organization.dao.ILabFlowGroupDao;
import com.yx.sz.laboratory.organization.service.ILabFlowGroupService;

public class LabFlowGroupServiceImpl implements ILabFlowGroupService{

	private ILabFlowGroupDao lfgDao;
	@Override
	public void add(LabFlowGroup group) {
		lfgDao.save(group);
	}

	@Override
	public void delete(LabFlowGroup group) {
		lfgDao.delete(group);
	}

	@Override
	public void update(LabFlowGroup group) {
		lfgDao.update(group);
	}

	@Override
	public LabFlowGroup getById(Long id) {
		return lfgDao.getById(id);
	}

	@Override
	public List<LabFlowGroup> list() {
		return lfgDao.list();
	}

	public ILabFlowGroupDao getLfgDao() {
		return lfgDao;
	}

	public void setLfgDao(ILabFlowGroupDao lfgDao) {
		this.lfgDao = lfgDao;
	}

}
