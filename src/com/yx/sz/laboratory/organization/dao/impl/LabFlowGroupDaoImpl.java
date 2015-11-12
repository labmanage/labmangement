package com.yx.sz.laboratory.organization.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.organization.bean.LabFlowGroup;
import com.yx.sz.laboratory.organization.dao.ILabFlowGroupDao;

public class LabFlowGroupDaoImpl extends HibernateDaoSupport implements ILabFlowGroupDao{

	@Override
	public void save(LabFlowGroup fg) {
		this.getHibernateTemplate().save(fg);
	}

	@Override
	public void delete(LabFlowGroup fg) {
		this.getHibernateTemplate().delete(fg);
	}

	@Override
	public void update(LabFlowGroup fg) {
		this.getHibernateTemplate().saveOrUpdate(fg);
	}

	@Override
	public LabFlowGroup getById(Long id) {
		List<LabFlowGroup> list = this.getHibernateTemplate().find("FROM LabFlowGroup f where f.id = " + id);
		if(null!=list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<LabFlowGroup> list() {
		return this.getHibernateTemplate().find("FROM LabFlowGroup f");
	}

}
