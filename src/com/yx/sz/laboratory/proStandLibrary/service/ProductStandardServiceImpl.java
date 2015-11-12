package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.ProductStandard;
import com.yx.sz.laboratory.proStandLibrary.dao.ProductStandardDao;

public class ProductStandardServiceImpl implements ProductStandardService {

	private ProductStandardDao productStandardDao ;

	@Override
	public void updateProductStandard(ProductStandard productStandard) {
		this.productStandardDao.updaProductStandard(productStandard);
	}

	@Override
	public void saveProductStandard(ProductStandard productStandard) {
		this.productStandardDao.saveProductStandard(productStandard);
	}

	@Override
	public void delProductStandard(ProductStandard productStandard) {
		this.productStandardDao.delProductStandard(productStandard);
	}

	@Override
	public List getProductStandardByprocDefinitionId() {
		List list = this.productStandardDao.getProductStandardList();
		return list;
	}

	@Override
	public ProductStandard getProductStandardById(int id) {
		ProductStandard productStandard = this.productStandardDao.getProductStandardById(id);
		return productStandard;
	}

	public ProductStandardDao getProductStandardDao() {
		return productStandardDao;
	}

	public void setProductStandardDao(ProductStandardDao productStandardDao) {
		this.productStandardDao = productStandardDao;
	}

}
