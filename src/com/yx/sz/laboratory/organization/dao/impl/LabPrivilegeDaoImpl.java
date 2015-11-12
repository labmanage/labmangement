package com.yx.sz.laboratory.organization.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.organization.dao.ILabPrivilegeDao;

public class LabPrivilegeDaoImpl extends HibernateDaoSupport implements
		ILabPrivilegeDao {

	@Override
	public void save(LabPrivilege privilege) {
		this.getHibernateTemplate().save(privilege);
	}

	@Override
	public void delete(LabPrivilege privilege) {
		this.getHibernateTemplate().delete(privilege);
	}

	@Override
	public LabPrivilege getById(Long pid) {
		List<LabPrivilege> list = this.getHibernateTemplate().find("FROM LabPrivilege l WHERE l.id = ?",pid);
		if(null != list && list.size() > 0 ) return list.get(0);
		return null;
	}

	@Override
	public LabPrivilege get(LabPrivilege privilege) {
		List<LabPrivilege> list = this.getHibernateTemplate().find("FROM LabPrivilege l WHERE l.id = ?",privilege.getId());
		if(null != list && list.size() > 0 ) return list.get(0);
		return null;
	}

	@Override
	public void update(LabPrivilege privilege) {
		this.getHibernateTemplate().saveOrUpdate(privilege);
	}

	@Override
	public List<LabPrivilege> getAll() {
		return this.getHibernateTemplate().find("FROM LabPrivilege l");
	}

	@Override
	public List<LabPrivilege> getByRole(LabRole role) {
		return null;
	}

}
