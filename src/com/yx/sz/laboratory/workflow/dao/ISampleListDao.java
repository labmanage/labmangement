package com.yx.sz.laboratory.workflow.dao;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.SampleList;


public interface ISampleListDao {

	List<SampleList> findSampleListList();

	void saveSampleList(SampleList sampleList);

	SampleList findSampleListById(long id);

	void updateSampleList(SampleList sampleList);

	void deleteSampleListById(long id);

}
