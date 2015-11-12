package com.yx.sz.laboratory.proStandardLib.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParam;

public interface INonFoodParamDao {
	public void save(NonFoodParam fd);
	public void batchSave(List<NonFoodParam> list);
	public void delete(NonFoodParam fd);
	public void update(NonFoodParam fd);
	public NonFoodParam getById(int id);
	public List<NonFoodParam> getAll();
}
