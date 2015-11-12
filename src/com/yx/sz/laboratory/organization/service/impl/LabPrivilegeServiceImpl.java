package com.yx.sz.laboratory.organization.service.impl;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.dao.ILabPrivilegeDao;
import com.yx.sz.laboratory.organization.service.ILabPrivilegeService;

public class LabPrivilegeServiceImpl implements ILabPrivilegeService{
	private ILabPrivilegeDao pDao;

	@Override
	public void add(LabPrivilege p) {
		pDao.save(p);
	}

	@Override
	public void delete(LabPrivilege p) {
		pDao.delete(p);
	}

	@Override
	public void update(LabPrivilege p) {
		pDao.update(p);
	}

	@Override
	public LabPrivilege getById(Long id) {
		return pDao.getById(id);
	}

	@Override
	public List<LabPrivilege> list() {
		return pDao.getAll();
	}

	public ILabPrivilegeDao getpDao() {
		return pDao;
	}

	public void setpDao(ILabPrivilegeDao pDao) {
		this.pDao = pDao;
	}

}
