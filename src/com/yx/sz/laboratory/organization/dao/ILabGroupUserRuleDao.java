package com.yx.sz.laboratory.organization.dao;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabGroupUser;

public interface ILabGroupUserRuleDao {
	
	public void updateLabGroupUser(LabGroupUser labGroupUser);
	
	public void saveLabGroupUser(LabGroupUser labGroupUser);
	
	public void delLabGroupUser(LabGroupUser labGroupUser);
	
	public List getUserNameByprocDefinitionIdAndUserTask(String procDefinitionId,String userTask);
	
	public LabGroupUser getLabGroupUserById(int id);
	
	public List getLabGroupUserList();
	
	
}
