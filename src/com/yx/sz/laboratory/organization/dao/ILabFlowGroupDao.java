package com.yx.sz.laboratory.organization.dao;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabFlowGroup;

public interface ILabFlowGroupDao {
	public void save(LabFlowGroup fg);
	public void delete(LabFlowGroup fg);
	public void update(LabFlowGroup fg);
	public LabFlowGroup getById(Long id);
	public List<LabFlowGroup> list();
}
