package com.yx.sz.laboratory.proStandLibrary.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.proStandLibrary.dao.CheckReportDao;

public class CheckReportDaoImpl extends HibernateDaoSupport implements CheckReportDao {

	@Override
	public void updateCheckReport(CheckReport checkReport) {
		this.getHibernateTemplate().update(checkReport);

	}

	@Override
	public void saveCheckReport(CheckReport checkReport) {
		this.getHibernateTemplate().save(checkReport);

	}

	@Override
	public List getCheckReportList() {
		
		String hql = "from CheckReport";
		List<CheckReport> list = this.getHibernateTemplate().find(hql);
		
		return list;
	}

	@Override
	public CheckReport getCheckReport(int id) {
		
		CheckReport checkReport = this.getHibernateTemplate().get(CheckReport.class, id);
		
		return checkReport;
	}

	@Override
	public void delCheckReport(int id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(CheckReport.class, id)
				);
	}

	@Override
	public int getTheSameCount(String chanpinMc,String hql) {
		
		//String hql = "from Users where name=? and passwd=?";   
       // Query query = session.createQuery(hql);   
        //第1种方式   
//      query.setString(0, "name1");   
//      query.setString(1, "password1");   
        //第2种方式   
//        query.setParameter(0, "name1",Hibernate.STRING);   
//        query.setParameter(1, "password1",Hibernate.STRING);   
//        List<Users> list = query.list();   
//        for(Users users : list){   
//            System.out.println(users.getId());   
//        }   
		int n = 0;
	///	String hql = "from CheckReport where chanpinMc=?";
		Query query = this.getSession().createQuery(hql);
		query.setString(1, chanpinMc); 
		List<CheckReport> list = new ArrayList();
		try {
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(list != null){
			n = list.size();
			
		}
		return n;
		
	}

	@Override
	public List getCheckReportListBySampleListId(int sampleListId,String hql) {
		
		List<CheckReport> list = new ArrayList<CheckReport>();
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, sampleListId); 
		list = query.list();
		return list;
	}
	
	public List getCheckReportListBySampleListIdAndExecutionId(int sampleListId,String executionId,String hql){
		
		List<CheckReport> list = new ArrayList<CheckReport>();
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, sampleListId); 
		query.setParameter(1, executionId); 
		list = query.list();
		return list;
	}

	@Override
	public CheckReport getCheckReportListByProcessInstanceIdAndExecutionId(
			String processInstanceId, String executionId, String hql) {
		List<CheckReport> list = new ArrayList<CheckReport>();
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, processInstanceId);
		query.setParameter(1, executionId);
		list = query.list();
		CheckReport checkReport = new CheckReport();
		if(list != null && list.size()>0){
			checkReport = list.get(0);
		}
		return checkReport;
	} 


}
