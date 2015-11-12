package com.yx.sz.laboratory.proStandLibrary.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParametersEquipment;
import com.yx.sz.laboratory.proStandLibrary.dao.NonFoodParametersEquipmentDao;

public class NonFoodParametersEquipmentDaoImpl extends HibernateDaoSupport implements
	NonFoodParametersEquipmentDao {

	@Override
	public void updaNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment) {
		this.getHibernateTemplate().update(nonFoodParametersEquipment);
	}

	@Override
	public void saveNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment) {
		this.getHibernateTemplate().save(nonFoodParametersEquipment);
	}

	@Override
	public void delNonFoodParametersEquipment(NonFoodParametersEquipment nonFoodParametersEquipment) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(nonFoodParametersEquipment.getClass(),
						nonFoodParametersEquipment.getId()));

	}

	@Override
	public NonFoodParametersEquipment getNonFoodParametersEquipmentById(int id) {
		String hql = "from NonFoodParametersEquipment o where o.id=?";

		List<NonFoodParametersEquipment> list = this.getHibernateTemplate().find(hql, id);
		NonFoodParametersEquipment nonFoodParametersEquipment = new NonFoodParametersEquipment();
		if (list != null && list.size() > 0) {
			nonFoodParametersEquipment = list.get(0);
		}

		return nonFoodParametersEquipment;
	}

	@Override
	public List getNonFoodParametersEquipmentList() {
		String hql = "from NonFoodParametersEquipment";
		List<NonFoodParametersEquipment> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
