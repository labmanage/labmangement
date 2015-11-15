package com.yx.sz.laboratory.proStandardLib.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.dao.INonFoodParamAndEquipmentDao;
@SuppressWarnings("unchecked")
public class NonFoodParamAndEquipmentDaoImpl  extends HibernateDaoSupport implements INonFoodParamAndEquipmentDao{

	@Override
	public void save(NonFoodParamAndEquipment fd) {
		this.getHibernateTemplate().save(fd);
	}

	@Override
	public void batchSave(List<NonFoodParamAndEquipment> list) {
		this.getSession().createSQLQuery("delete from lab_NonFoodParamAndEquipment  ").executeUpdate();  
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
	public void delete(NonFoodParamAndEquipment fd) {
		this.getHibernateTemplate().delete(fd);
	}

	@Override
	public void update(NonFoodParamAndEquipment fd) {
		this.getHibernateTemplate().saveOrUpdate(fd);
	}

	@Override
	public NonFoodParamAndEquipment getById(int id) {
		List<NonFoodParamAndEquipment> list = this.getHibernateTemplate().find("From NonFoodParamAndEquipment f WHERE f.id = ?", id);
		if(null!=list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<NonFoodParamAndEquipment> getTopAll() {
		String hql = "FROM NonFoodParamAndEquipment f WHERE f.id in (select min(id)  from lab_foodParamAndEquipment group by seq) order by id asc";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List<NonFoodParamAndEquipment> getByTop(NonFoodParamAndEquipment nfpe) {
		return this.getHibernateTemplate().find("FROM NonFoodParamAndEquipment f WHERE f.seq = ?",nfpe.getSeq());
	}
	
	
	
	@Override
	public List<NonFoodParamAndEquipment> getAll() {
		return this.getHibernateTemplate().find("From NonFoodParamAndEquipment f");
	}

}