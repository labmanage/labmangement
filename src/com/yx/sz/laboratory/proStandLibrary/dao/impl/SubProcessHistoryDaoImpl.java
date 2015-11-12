package com.yx.sz.laboratory.proStandLibrary.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandLibrary.bean.SubProcessHistory;
import com.yx.sz.laboratory.proStandLibrary.dao.SubProcessHistoryDao;

public class SubProcessHistoryDaoImpl extends HibernateDaoSupport implements SubProcessHistoryDao {

	@Override
	public void updateSubPorcessHistory(SubProcessHistory subProcessHistory) {
		
		this.getHibernateTemplate().update(subProcessHistory);

	}

	@Override
	public void saveSubPorcessHistory(SubProcessHistory subProcessHistory) {
		
		this.getHibernateTemplate().save(subProcessHistory);
	}

	@Override
	public List getSubPorcessHistoryList() {
		
		String hql = "from SubPrcessHistory";
		
		List<SubProcessHistory> list = this.getSession().createQuery(hql).list();
		
		return list;
	}

	@Override
	public SubProcessHistory getSubProcessHistory(int id) {
		
		SubProcessHistory subprocess = this.getHibernateTemplate().get(SubProcessHistory.class, id);
		
		return subprocess;
	}

	@Override
	public void delSubProcessHistory(int id) {
		
		this.getHibernateTemplate().delete(
					this.getHibernateTemplate().get(SubProcessHistory.class, id)
				);
		
	}

	@Override
	public SubProcessHistory getSubProcessHistoryListByCommentId(
			String commentId) {
		String hql = "from SubProcessHistory where commnetId = ?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, commentId);
		List<SubProcessHistory> list = query.list();
		SubProcessHistory subprocessh = new SubProcessHistory();
		if(list != null && list.size()>0){
			subprocessh = list.get(0);
		}
		return subprocessh;
	}

	@Override
	public SubProcessHistory getSubProcessHistoryListByProInstanceIdAndtaskId(
			String proInstanceId, String taskId) {
		
		String hql = "from SubProcessHistory where processInstanceId = ? and taskId = ?";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, proInstanceId);
		query.setParameter(1, taskId);
		List<SubProcessHistory> list = query.list();
		SubProcessHistory subprocessh = new SubProcessHistory();
		if(list != null && list.size()>0){
			subprocessh = list.get(0);
		}
		return subprocessh;
	}
}
