package com.yx.sz.laboratory.workflow.service;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.SampleList;


public interface ISampleListService {

	List<SampleList> findSampleListList();

	void saveSampleList(SampleList sampleList);

	SampleList findSampleListById(long id);

	void deleteSampleListById(long id);
	
}
