package com.yx.sz.laboratory.organization.service;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabRole;

public interface ILabRoleService {
	public void add(LabRole role);
	public void delete(LabRole role);
	public void update(LabRole role);
	public LabRole getById(Long id);
	public List<LabRole> list();
}
