package com.yx.sz.laboratory.workflow.service;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;


public interface IPollutionFreeSampleListService {
	List<PollutionFreeSampleList> list();
	PollutionFreeSampleList findById(long id);
	void save(PollutionFreeSampleList sl);
	void delete(PollutionFreeSampleList sl);
	void update(PollutionFreeSampleList sl);
}
