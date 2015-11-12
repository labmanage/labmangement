package com.yx.sz.laboratory.organization.dao;


import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.bean.LabRole;

public interface ILabPrivilegeDao {
	public void save(LabPrivilege privilege);
	public void delete(LabPrivilege privilege);
	public LabPrivilege getById(Long pid);
	public LabPrivilege get(LabPrivilege privilege);
	public void update(LabPrivilege privilege);
	public List<LabPrivilege> getAll();
	public List<LabPrivilege> getByRole(LabRole role);
}
