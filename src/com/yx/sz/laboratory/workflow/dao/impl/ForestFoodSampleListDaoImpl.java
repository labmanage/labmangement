package com.yx.sz.laboratory.workflow.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.domain.Employee;

import com.yx.sz.laboratory.util.SessionContext;
import com.yx.sz.laboratory.workflow.bean.ForestFoodSampleList;
import com.yx.sz.laboratory.workflow.dao.IForestFoodSampleListDao;

public class ForestFoodSampleListDaoImpl extends HibernateDaoSupport implements
		IForestFoodSampleListDao {

	@Override
	public List<ForestFoodSampleList> list() {
		Employee e = SessionContext.get();
		String hql= "FROM ForestFoodSampleList o where o.userId = " + e.getUserId();
		if(e.getUserId().equals("admin")){
			hql= "FROM ForestFoodSampleList o ";
		}
		return this.getHibernateTemplate().find("FROM ForestFoodSampleList o");
	}

	@Override
	public ForestFoodSampleList getById(long id) {
		List<ForestFoodSampleList> list = this.getHibernateTemplate().find("FROM ForestFoodSampleList o where o.id = ?",id);
		if(null != list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void save(ForestFoodSampleList sl) {
		this.getHibernateTemplate().save(sl);
	}

	@Override
	public void delete(ForestFoodSampleList sl) {
		this.getHibernateTemplate().delete(sl);
	}

	@Override
	public void update(ForestFoodSampleList sl) {
		this.getHibernateTemplate().saveOrUpdate(sl);
	}

}
