package com.yx.sz.laboratory.proStandLibrary.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yx.sz.laboratory.proStandLibrary.bean.ProductStandard;
import com.yx.sz.laboratory.proStandLibrary.dao.ProductStandardDao;

public class ProductStandardDaoImpl extends HibernateDaoSupport implements
	ProductStandardDao {

	@Override
	public void updaProductStandard(ProductStandard productStandard) {
		this.getHibernateTemplate().update(productStandard);
	}

	@Override
	public void saveProductStandard(ProductStandard productStandard) {
		this.getHibernateTemplate().save(productStandard);
	}

	@Override
	public void delProductStandard(ProductStandard productStandard) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(productStandard.getClass(),
						productStandard.getId()));

	}

	@Override
	public ProductStandard getProductStandardById(int id) {
		String hql = "from ProductStandard o where o.id=?";

		List<ProductStandard> list = this.getHibernateTemplate().find(hql, id);
		ProductStandard productStandard = new ProductStandard();
		if (list != null && list.size() > 0) {
			productStandard = list.get(0);
		}

		return productStandard;
	}

	@Override
	public List getProductStandardList() {
		String hql = "from ProductStandard";
		List<ProductStandard> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
