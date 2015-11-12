package com.yx.sz.laboratory.organization.service;

import java.util.List;

import com.yx.sz.laboratory.organization.bean.LabGroupUser;
import com.yx.sz.laboratory.organization.dao.ILabGroupUserRuleDao;

public class LabGroupUserRuleServiceImpl implements ILabGroupUserRuleService {

	private ILabGroupUserRuleDao labGroupUserRuleDao ;
	
	@Override
	public void updateLabGroupUser(LabGroupUser labGroupUser) {
		
		this.labGroupUserRuleDao.updateLabGroupUser(labGroupUser);
	}

	@Override
	public void saveLabGroupUser(LabGroupUser labGroupUser) {
		
		this.labGroupUserRuleDao.saveLabGroupUser(labGroupUser);
	}

	@Override
	public void delLabGroupUser(LabGroupUser labGroupUser) {
		
		this.labGroupUserRuleDao.delLabGroupUser(labGroupUser);
	}

	@Override
	public List getUserNameByprocDefinitionIdAndUserTask(String procDefinitionId,String userTask) {
		
		List list = this.labGroupUserRuleDao.getUserNameByprocDefinitionIdAndUserTask(procDefinitionId,userTask);
		
		return list;
	}

	@Override
	public LabGroupUser getLabGroupUserById(int id) {
		
		LabGroupUser labGroupUser = this.labGroupUserRuleDao.getLabGroupUserById(id);
		
		return labGroupUser;
	}
	
	@Override
	public List getLabGroupUserByprocDefinitionId() {
		
		List list = this.labGroupUserRuleDao.getLabGroupUserList();
		
		return list;
	}

	public ILabGroupUserRuleDao getLabGroupUserRuleDao() {
		return labGroupUserRuleDao;
	}

	public void setLabGroupUserRuleDao(ILabGroupUserRuleDao labGroupUserRuleDao) {
		this.labGroupUserRuleDao = labGroupUserRuleDao;
	}

}
