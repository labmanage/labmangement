package com.yx.sz.laboratory.proStandardLib.service;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParam;

public interface IFoodParamService {
	public List<FoodParam> getAll();
	public List<FoodParam> getTop();
	public List<FoodParam> getByTop(FoodParam fp);
	public void save(FoodParam foodParameters);
	public FoodParam getById(int id);
	public void update(FoodParam foodParameters);
	public void delete(FoodParam foodParameters);
}
