package com.yx.sz.laboratory.workflow.service;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.ForestFoodSampleList;


public interface IForestFoodSampleListService {
	List<ForestFoodSampleList> list();
	ForestFoodSampleList findById(long id);
	void save(ForestFoodSampleList sl);
	void delete(ForestFoodSampleList sl);
	void update(ForestFoodSampleList sl);
}
