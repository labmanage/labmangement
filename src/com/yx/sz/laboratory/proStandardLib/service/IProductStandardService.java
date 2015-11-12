package com.yx.sz.laboratory.proStandardLib.service;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;

public interface IProductStandardService {
	public List<FoodStandard> getAllProductStandard();

	public FoodStandard getById(FoodStandard productStandard);

	public void save(FoodStandard productStandard);

	public void update(FoodStandard productStandard);

	public void delete(FoodStandard productStandard);
}
