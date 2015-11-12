package com.yx.sz.laboratory.organization.service;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabGroupUser;

public interface ILabGroupUserRuleService {

	public void updateLabGroupUser(LabGroupUser labGroupUser);
	
	public void saveLabGroupUser(LabGroupUser labGroupUser);
	
	public void delLabGroupUser(LabGroupUser labGroupUser);
	
	public List getUserNameByprocDefinitionIdAndUserTask(String procDefinitionId,String userTask);
	
	public List getLabGroupUserByprocDefinitionId();
	
	public LabGroupUser getLabGroupUserById(int id);
}
