package com.yx.sz.laboratory.proStandardLib.service;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParam;

public interface NonFoodParamService {
	public List<NonFoodParam> getAll();

	public void save(NonFoodParam nonFoodParameters);

	public NonFoodParam getById(int id);

	public void update(NonFoodParam nonFoodParameters);

	public void delete(NonFoodParam nonFoodParameters);
}
