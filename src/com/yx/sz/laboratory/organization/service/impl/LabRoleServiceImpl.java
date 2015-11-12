package com.yx.sz.laboratory.organization.service.impl;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.organization.dao.ILabRoleDao;
import com.yx.sz.laboratory.organization.service.ILabRoleService;

public class LabRoleServiceImpl implements ILabRoleService{
	private ILabRoleDao labRoleDao;

	@Override
	public void add(LabRole role) {
		labRoleDao.save(role);
	}

	@Override
	public void delete(LabRole role) {
		labRoleDao.delete(role);
	}

	@Override
	public void update(LabRole role) {
		labRoleDao.update(role);
	}

	@Override
	public LabRole getById(Long id) {
		return labRoleDao.getById(id);
	}

	@Override
	public List<LabRole> list() {
		return labRoleDao.list();
	}

	public ILabRoleDao getLabRoleDao() {
		return labRoleDao;
	}

	public void setLabRoleDao(ILabRoleDao labRoleDao) {
		this.labRoleDao = labRoleDao;
	}

	
}
