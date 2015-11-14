package com.yx.sz.laboratory.workflow.dao;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.ForestFoodSampleList;

public interface IForestFoodSampleListDao {
	public List<ForestFoodSampleList> list();
	public ForestFoodSampleList getById(long id);
	public void save(ForestFoodSampleList sl);
	public void delete(ForestFoodSampleList sl);
	public void update(ForestFoodSampleList sl);
}
