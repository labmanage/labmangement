package com.yx.sz.laboratory.workflow.dao;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;

public interface IPollutionFreeSampleListDao {
	public List<PollutionFreeSampleList> list();
	public PollutionFreeSampleList getById(long id);
	public void save(PollutionFreeSampleList sl);
	public void delete(PollutionFreeSampleList sl);
	public void update(PollutionFreeSampleList sl);
}
