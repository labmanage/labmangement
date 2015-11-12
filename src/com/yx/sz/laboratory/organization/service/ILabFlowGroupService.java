package com.yx.sz.laboratory.organization.service;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabFlowGroup;

public interface ILabFlowGroupService {
	public void add(LabFlowGroup group);
	public void delete(LabFlowGroup group);
	public void update(LabFlowGroup group);
	public LabFlowGroup getById(Long id);
	public List<LabFlowGroup> list();
}
