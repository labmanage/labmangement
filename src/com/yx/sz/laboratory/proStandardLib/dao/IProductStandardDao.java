package com.yx.sz.laboratory.proStandardLib.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;

public interface IProductStandardDao {
	public void save(FoodStandard fd);
	public void batchSave(List<FoodStandard> list);
	public void delete(FoodStandard fd);
	public void update(FoodStandard fd);
	public FoodStandard getById(int id);
	public List<FoodStandard> getAll();
}
