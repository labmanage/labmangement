package com.yx.sz.laboratory.workflow.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.domain.Employee;

import com.yx.sz.laboratory.util.SessionContext;
import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;
import com.yx.sz.laboratory.workflow.dao.IPollutionFreeSampleListDao;

public class PollutionFreeSampleListDaoImpl extends HibernateDaoSupport implements
		IPollutionFreeSampleListDao {

	@Override
	public List<PollutionFreeSampleList> list() {
		Employee e = SessionContext.get();
		String hql = "FROM PollutionFreeSampleList o where o.userId = '"+e.getUserId()+"'";//指定当前用户的抽样单
		if(e.getUserId().equals("admin")){
			hql = "FROM PollutionFreeSampleList o";
		}
		return this.getHibernateTemplate().find(hql);
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
