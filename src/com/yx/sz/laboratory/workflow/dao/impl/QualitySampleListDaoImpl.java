package com.yx.sz.laboratory.workflow.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.workflow.bean.QualitySampleList;
import com.yx.sz.laboratory.workflow.dao.IQualitySampleListDao;

public class QualitySampleListDaoImpl extends HibernateDaoSupport implements
		IQualitySampleListDao {

	@Override
	public List<QualitySampleList> list() {
		return this.getHibernateTemplate().find("FROM QualitySampleList o");
	}

	@Override
	public QualitySampleList getById(long id) {
		List<QualitySampleList> list = this.getHibernateTemplate().find("FROM QualitySampleList o where o.id = ?",id);
		if(null != list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(QualitySampleList sl) {
		this.getHibernateTemplate().save(sl);
	}

	@Override
	public void delete(QualitySampleList sl) {
		this.getHibernateTemplate().delete(sl);
	}

	@Override
	public void update(QualitySampleList sl) {
		this.getHibernateTemplate().saveOrUpdate(sl);
	}

}
