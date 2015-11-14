package com.yx.sz.laboratory.workflow.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;
import com.yx.sz.laboratory.workflow.dao.IPollutionFreeSampleListDao;

public class PollutionFreeSampleListDaoImpl extends HibernateDaoSupport implements
		IPollutionFreeSampleListDao {

	@Override
	public List<PollutionFreeSampleList> list() {
		return this.getHibernateTemplate().find("FROM PollutionFreeSampleList o");
	}

	@Override
	public PollutionFreeSampleList getById(long id) {
		List<PollutionFreeSampleList> list = this.getHibernateTemplate().find("FROM PollutionFreeSampleList o where o.id = ?",id);
		if(null != list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(PollutionFreeSampleList sl) {
		this.getHibernateTemplate().save(sl);
	}

	@Override
	public void delete(PollutionFreeSampleList sl) {
		this.getHibernateTemplate().delete(sl);
	}

	@Override
	public void update(PollutionFreeSampleList sl) {
		this.getHibernateTemplate().saveOrUpdate(sl);
	}

}
