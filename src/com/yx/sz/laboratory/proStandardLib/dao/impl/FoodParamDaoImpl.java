package com.yx.sz.laboratory.proStandardLib.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParam;
import com.yx.sz.laboratory.proStandardLib.dao.IFoodParamDao;
@SuppressWarnings("unchecked")
public class FoodParamDaoImpl extends HibernateDaoSupport implements IFoodParamDao{

	@Override
	public void save(FoodParam fd) {
		this.getHibernateTemplate().save(fd);
	}

	@Override
	public void batchSave(List<FoodParam> list) {
		for(int i = 0 ; i < list.size(); i++){
			this.getHibernateTemplate().save(list.get(i));
			if(i%50 == 0){
				this.getHibernateTemplate().flush();
				this.getHibernateTemplate().clear();
			}
		}
	}

	@Override
	public void delete(FoodParam fd) {
		this.getHibernateTemplate().delete(fd);
	}

	@Override
	public void update(FoodParam fd) {
		this.getHibernateTemplate().saveOrUpdate(fd);
	}

	@Override
	public FoodParam getById(int id) {
		List<FoodParam> list = this.getHibernateTemplate().find("From FoodParam f WHERE f.id = ?", id);
		if(null!=list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	
	@Override
	public List<FoodParam> getAll() {
		return this.getHibernateTemplate().find("From FoodParam f");
	}

	@Override
	public List<FoodParam> getTop() {
		String hql = "FROM FoodParam f WHERE f.id in (SELECT min(f1.id) from FoodParam f1 group by f1.projectSeq) order by f.id asc";
		
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List<FoodParam> getByTop(FoodParam fp) {
		return this.getHibernateTemplate().find("FROM FoodParam f WHERE f.projectSeq = ?",fp.getProjectSeq());
	}

}
