package com.yx.sz.laboratory.proStandLibrary.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yx.sz.laboratory.proStandLibrary.bean.FoodParameters;
import com.yx.sz.laboratory.proStandLibrary.dao.FoodParametersDao;

public class FoodParametersDaoImpl extends HibernateDaoSupport implements
FoodParametersDao {

	@Override
	public void updaFoodParameters(FoodParameters foodParameters) {
		this.getHibernateTemplate().update(foodParameters);
	}

	@Override
	public void saveFoodParameters(FoodParameters foodParameters) {
		this.getHibernateTemplate().save(foodParameters);
	}

	@Override
	public void delFoodParameters(FoodParameters foodParameters) {
		this.getHibernateTemplate().delete(foodParameters);

	}

	@Override
	public FoodParameters getFoodParametersById(int id) {
		String hql = "from FoodParameters o where o.id=?";

		List<FoodParameters> list = this.getHibernateTemplate().find(hql, id);
		FoodParameters foodParameters = new FoodParameters();
		if (list != null && list.size() > 0) {
			foodParameters = list.get(0);
		}

		return foodParameters;
	}

	@Override
	public List getFoodParametersList() {
		String hql = "from FoodParameters";
		List<FoodParameters> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
