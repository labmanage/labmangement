package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.ProductStandard;

public interface ProductStandardService {

	public void updateProductStandard(ProductStandard productStandard);
	
	public void saveProductStandard(ProductStandard productStandard);
	
	public void delProductStandard(ProductStandard productStandard);
	
	public List getProductStandardByprocDefinitionId();
	
	public ProductStandard getProductStandardById(int id);

}
