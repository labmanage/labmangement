package com.yx.sz.laboratory.organization.service;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabPrivilege;

public interface ILabPrivilegeService {
	public void add(LabPrivilege p);
	public void delete(LabPrivilege p);
	public void update(LabPrivilege p);
	public LabPrivilege getById(Long id);
	public List<LabPrivilege> list();
}
