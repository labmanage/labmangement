package com.yx.sz.laboratory.workflow.service;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.CattleSampleList;


public interface ICattleSampleListService {
	List<CattleSampleList> list();
	CattleSampleList findById(long id);
	void save(CattleSampleList sl);
	void delete(CattleSampleList sl);
	void update(CattleSampleList sl);
}
