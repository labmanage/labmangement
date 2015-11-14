package com.yx.sz.laboratory.workflow.service;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.QualitySampleList;


public interface IQualitySampleListService {
	List<QualitySampleList> list();
	QualitySampleList findById(long id);
	void save(QualitySampleList sl);
	void delete(QualitySampleList sl);
	void update(QualitySampleList sl);
}
