package com.yx.sz.laboratory.organization.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.domain.LeaveBill;

import com.yx.sz.laboratory.organization.bean.LabGroupUser;
import com.yx.sz.laboratory.organization.dao.ILabGroupUserRuleDao;

public class LabGroupUserRuleDaoImpl extends HibernateDaoSupport implements
		ILabGroupUserRuleDao {

	@Override
	public void updateLabGroupUser(LabGroupUser labGroupUser) {
		
	//	this.getHibernateTemplate().update(
	//			this.getHibernateTemplate().get(labGroupUser.getClass(), labGroupUser.getId()));
		
		this.getHibernateTemplate().saveOrUpdate(labGroupUser);
		
	}

	@Override
	public void saveLabGroupUser(LabGroupUser labGroupUser) {
		
		this.getHibernateTemplate().save(labGroupUser);
	}

	@Override
	public void delLabGroupUser(LabGroupUser labGroupUser) {
		
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(labGroupUser.getClass(), labGroupUser.getId()));
	}

	@Override
	public List getUserNameByprocDefinitionIdAndUserTask(String procDefinitionId,String userTask) {
		
		String hql = "from LabGroupUser o where o.processDefinitionId=? and o.taskName=?";
		
		String[] arg = new String[]{procDefinitionId,userTask};
		
		List<LabGroupUser> list = this.getHibernateTemplate().find(hql,arg);
		List<String> strList = new ArrayList();
		if(list != null && list.size()>0){
			for(LabGroupUser labGroupUser:list){
				String username = labGroupUser.getUserName();
				strList.add(username);
			}
		}
		
		return strList;
	}

	@Override
	public LabGroupUser getLabGroupUserById(int id) {
		
		String hql = "from LabGroupUser o where o.id=?";
		
		List<LabGroupUser> list = this.getHibernateTemplate().find(hql,id);
		LabGroupUser labGroupUser = new LabGroupUser();
		if(list != null && list.size()>0){
		 labGroupUser = list.get(0);
		}
		
		return labGroupUser;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List getLabGroupUserList() {

		String hql = "from LabGroupUser";
		
		
		List<LabGroupUser> list = this.getHibernateTemplate().find(hql);
		
		return list;
	}

}
