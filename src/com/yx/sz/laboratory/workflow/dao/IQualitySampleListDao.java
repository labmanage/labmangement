package com.yx.sz.laboratory.workflow.dao;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.QualitySampleList;

public interface IQualitySampleListDao {
	public List<QualitySampleList> list();
	public QualitySampleList getById(long id);
	public void save(QualitySampleList sl);
	public void delete(QualitySampleList sl);
	public void update(QualitySampleList sl);
}
