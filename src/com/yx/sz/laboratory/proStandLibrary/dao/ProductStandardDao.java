package com.yx.sz.laboratory.proStandLibrary.dao;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.ProductStandard;


public interface ProductStandardDao {
	
	public void updaProductStandard(ProductStandard productStandard);
	
	public void saveProductStandard(ProductStandard productStandard);
	
	public void delProductStandard(ProductStandard productStandard);
		
	public ProductStandard getProductStandardById(int id);
	
	public List getProductStandardList();

}
