package com.yx.sz.laboratory.proStandardLib.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParam;

public interface IFoodParamDao {
	public void save(FoodParam fd);
	public void batchSave(List<FoodParam> list);
	public void delete(FoodParam fd);
	public void update(FoodParam fd);
	public FoodParam getById(int id);
	public List<FoodParam> getAll();
	public List<FoodParam> getTop();
	public List<FoodParam> getByTop(FoodParam fp);
}
