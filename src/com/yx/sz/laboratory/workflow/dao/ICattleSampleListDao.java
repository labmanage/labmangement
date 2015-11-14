package com.yx.sz.laboratory.workflow.dao;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.CattleSampleList;

public interface ICattleSampleListDao {
	public List<CattleSampleList> list();
	public CattleSampleList getById(long id);
	public void save(CattleSampleList sl);
	public void delete(CattleSampleList sl);
	public void update(CattleSampleList sl);
}
