package com.yx.sz.laboratory.proStandardLib.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;
import com.yx.sz.laboratory.proStandardLib.dao.IProductStandardDao;

@SuppressWarnings("unchecked")
public class ProductStandardDaoImpl extends HibernateDaoSupport implements IProductStandardDao{

	@Override
	public void save(FoodStandard fd) {
		this.getHibernateTemplate().save(fd);
	}

	@Override
	public void batchSave(List<FoodStandard> list) {
		this.getSession().createSQLQuery("delete from lab_FoodStandard   ").executeUpdate();  
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
	public void delete(FoodStandard fd) {
		this.getHibernateTemplate().delete(fd);
	}

	@Override
	public void update(FoodStandard fd) {
		this.getHibernateTemplate().saveOrUpdate(fd);
	}

	@Override
	public FoodStandard getById(int id) {
		List<FoodStandard> list = this.getHibernateTemplate().find("FROM FoodStandard f where f.id = ?", id);
		if(null != list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	
	@Override
	public List<FoodStandard> getAll() {
		return this.getHibernateTemplate().find("FROM FoodStandard f");
	}

}
