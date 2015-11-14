package com.yx.sz.laboratory.proStandardLib.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.dao.IFoodParamAndEquipmentDao;
@SuppressWarnings("unchecked")
public class FoodParamAndEquipmentDaoImpl extends HibernateDaoSupport implements IFoodParamAndEquipmentDao{

	@Override
	public void save(FoodParamAndEquipment fd) {
		this.getHibernateTemplate().save(fd);
	}

	@Override
	public void batchSave(List<FoodParamAndEquipment> list) {
		for(int i = 0 ; i < list.size(); i++){
			this.getHibernateTemplate().save(list.get(i));
			if(i%50 == 0){
				this.getHibernateTemplate().flush();
				this.getHibernateTemplate().clear();
			}
		}
	}

	@Override
	public void delete(FoodParamAndEquipment fd) {
		this.getHibernateTemplate().delete(fd);
	}

	@Override
	public void update(FoodParamAndEquipment fd) {
		this.getHibernateTemplate().saveOrUpdate(fd);
	}

	@Override
	public FoodParamAndEquipment getById(int id) {
		List<FoodParamAndEquipment> list = this.getHibernateTemplate().find("From FoodParamAndEquipment f WHERE f.id = ?", id);
		if(null!=list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	
	
	@Override
	public List<FoodParamAndEquipment> getAll() {
		return this.getHibernateTemplate().find("From FoodParamAndEquipment f");
	}

	@Override
	public List<FoodParamAndEquipment> getTop() {
		String hql = "FROM FoodParamAndEquipment f WHERE f.id in (select min(fpe.id)  from FoodParamAndEquipment fpe group by fpe.sequence) order by f.id asc";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List<FoodParamAndEquipment> getByTop(FoodParamAndEquipment fpe) {
		return this.getHibernateTemplate().find("FROM FoodParamAndEquipment f WHERE f.sequence = ?",fpe.getSequence());
	}

	@Override
	public List<FoodParamAndEquipment> getSubItemsByProductName(String productName) {
		return this.getHibernateTemplate().find("FROM FoodParamAndEquipment f WHERE f.productName = ?",productName);
	}

}
