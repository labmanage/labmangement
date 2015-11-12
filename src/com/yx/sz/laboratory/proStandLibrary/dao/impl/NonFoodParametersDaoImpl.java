package com.yx.sz.laboratory.proStandLibrary.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParameters;
import com.yx.sz.laboratory.proStandLibrary.dao.NonFoodParametersDao;

public class NonFoodParametersDaoImpl extends HibernateDaoSupport implements
	NonFoodParametersDao {

	@Override
	public void updaNonFoodParameters(NonFoodParameters nonFoodParameters) {
		this.getHibernateTemplate().update(nonFoodParameters);
	}

	@Override
	public void saveNonFoodParameters(NonFoodParameters nonFoodParameters) {
		this.getHibernateTemplate().save(nonFoodParameters);
	}

	@Override
	public void delNonFoodParameters(NonFoodParameters nonFoodParameters) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(nonFoodParameters.getClass(),
						nonFoodParameters.getId()));

	}

	@Override
	public NonFoodParameters getNonFoodParametersById(int id) {
		String hql = "from NonFoodParameters o where o.id=?";

		List<NonFoodParameters> list = this.getHibernateTemplate().find(hql, id);
		NonFoodParameters nonFoodParameters = new NonFoodParameters();
		if (list != null && list.size() > 0) {
			nonFoodParameters = list.get(0);
		}

		return nonFoodParameters;
	}

	@Override
	public List getNonFoodParametersList() {
		String hql = "from NonFoodParameters";
		List<NonFoodParameters> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
