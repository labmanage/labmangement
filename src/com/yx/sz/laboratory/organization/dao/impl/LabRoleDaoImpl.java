package com.yx.sz.laboratory.organization.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.organization.dao.ILabRoleDao;

public class LabRoleDaoImpl extends HibernateDaoSupport implements ILabRoleDao{

	@Override
	public void save(LabRole role) {
		this.getHibernateTemplate().save(role);
	}

	@Override
	public void delete(LabRole role) {
		this.getHibernateTemplate().delete(role);
	}

	@Override
	public void update(LabRole role) {
		this.getHibernateTemplate().saveOrUpdate(role);
	}

	@Override
	public LabRole getById(Long id) {
		List<LabRole> list = this.getHibernateTemplate().find("FROM LabRole l WHERE l.id = ?",id) ;
		if(null!=list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<LabRole> list() {
		return this.getHibernateTemplate().find("FROM LabRole l");
	}

}
