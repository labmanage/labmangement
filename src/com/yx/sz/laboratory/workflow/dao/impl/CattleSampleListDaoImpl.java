package com.yx.sz.laboratory.workflow.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.workflow.bean.CattleSampleList;
import com.yx.sz.laboratory.workflow.dao.ICattleSampleListDao;

public class CattleSampleListDaoImpl extends HibernateDaoSupport implements
		ICattleSampleListDao {

	@Override
	public List<CattleSampleList> list() {
		return this.getHibernateTemplate().find("FROM CattleSampleList o");
	}

	@Override
	public CattleSampleList getById(long id) {
		List<CattleSampleList> list = this.getHibernateTemplate().find("FROM CattleSampleList o where o.id = ?",id);
		if(null != list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(CattleSampleList sl) {
		this.getHibernateTemplate().save(sl);
	}

	@Override
	public void delete(CattleSampleList sl) {
		this.getHibernateTemplate().delete(sl);
	}

	@Override
	public void update(CattleSampleList sl) {
		this.getHibernateTemplate().saveOrUpdate(sl);
	}

}
