package com.yx.sz.laboratory.proStandardLib.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParam;
import com.yx.sz.laboratory.proStandardLib.dao.INonFoodParamDao;
@SuppressWarnings("unchecked")
public class NonFoodParamDaoImpl  extends HibernateDaoSupport implements INonFoodParamDao{

	@Override
	public void save(NonFoodParam fd) {
		this.getHibernateTemplate().save(fd);
	}

	@Override
	public void batchSave(List<NonFoodParam> list) {
		this.getSession().createSQLQuery("delete from lab_NonFoodParam   ").executeUpdate();  
        this.getSession().flush(); //清理缓存，执行批量插入  
        this.getSession().clear(); //清空缓存中的 对象  
		for(int i = 0 ; i < list.size(); i++){
			this.getHibernateTemplate().save(list.get(i));
			if(i%50 == 0){
				this.getHibernateTemplate().flush();
				this.getHibernateTemplate().clear();
			}
		}
	}

	@Override
	public void delete(NonFoodParam fd) {
		this.getHibernateTemplate().delete(fd);
	}

	@Override
	public void update(NonFoodParam fd) {
		this.getHibernateTemplate().saveOrUpdate(fd);
	}

	@Override
	public NonFoodParam getById(int id) {
		List<NonFoodParam> list = this.getHibernateTemplate().find("From NonFoodParam f WHERE f.id = ?", id);
		if(null!=list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	
	
	
	@Override
	public List<NonFoodParam> getAll() {
		return this.getHibernateTemplate().find("From NonFoodParam f");
	}

}
