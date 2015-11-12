package com.yx.sz.laboratory.proStandLibrary.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yx.sz.laboratory.proStandLibrary.bean.FoodParametersEquipment;
import com.yx.sz.laboratory.proStandLibrary.dao.FoodParametersEquipmentDao;

public class FoodParametersEquipmentDaoImpl extends HibernateDaoSupport implements
	FoodParametersEquipmentDao {

	@Override
	public void updaFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment) {
		this.getHibernateTemplate().update(foodParametersEquipment);
	}

	@Override
	public void saveFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment) {
		this.getHibernateTemplate().save(foodParametersEquipment);
	}

	@Override
	public void delFoodParametersEquipment(FoodParametersEquipment foodParametersEquipment) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(foodParametersEquipment.getClass(),
						foodParametersEquipment.getId()));

	}

	@Override
	public FoodParametersEquipment getFoodParametersEquipmentById(int id) {
		String hql = "from FoodParametersEquipment o where o.id=?";

		List<FoodParametersEquipment> list = this.getHibernateTemplate().find(hql, id);
		FoodParametersEquipment foodParametersEquipment = new FoodParametersEquipment();
		if (list != null && list.size() > 0) {
			foodParametersEquipment = list.get(0);
		}

		return foodParametersEquipment;
	}

	@Override
	public List getFoodParametersEquipmentList() {
		String hql = "from FoodParametersEquipment";
		List<FoodParametersEquipment> list = this.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public List getFoodParametersEquipmentByChanpinMc(
			String chanpinMc) {
		String hql = "from FoodParametersEquipment o where o.chanpinMc=?";

		List<FoodParametersEquipment> list = this.getHibernateTemplate().find(hql, chanpinMc);
		FoodParametersEquipment foodParametersEquipment = new FoodParametersEquipment();
		if (list != null && list.size() > 0) {
			foodParametersEquipment = list.get(0);
		}

		return list;
	}

}
