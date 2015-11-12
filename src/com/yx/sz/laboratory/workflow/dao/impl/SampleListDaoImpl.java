package com.yx.sz.laboratory.workflow.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.utils.SessionContext;

import com.yx.sz.laboratory.workflow.bean.SampleList;
import com.yx.sz.laboratory.workflow.dao.ISampleListDao;

public class SampleListDaoImpl extends HibernateDaoSupport implements
		ISampleListDao {

	/**查询自己的抽样单信息*/
	@Override
	public List<SampleList> findSampleListList() {
		//从Session中获取当前用户
		Employee employee = SessionContext.get();
		String hql = "from SampleList o where o.userName=?";//指定当前用户的抽样单
		List<SampleList> list = this.getHibernateTemplate().find(hql,employee.getName());
		return list;
	}
	
	/**保存抽样单*/
	@Override
	public void saveSampleList(SampleList SampleList) {
		this.getHibernateTemplate().save(SampleList);
	}
	
	/**使用抽样单ID，查询抽样单的对象*/
	@Override
	public SampleList findSampleListById(long id) {
		return this.getHibernateTemplate().get(SampleList.class, id);
	}
	
	/**更新抽样单*/
	@Override
	public void updateSampleList(SampleList SampleList) {
		this.getHibernateTemplate().update(SampleList);
	}
	
	/**使用抽样单ID，删除抽样单*/
	@Override
	public void deleteSampleListById(long id) {
		//2：使用抽样单ID，查询抽样单信息，获取对象SampleList
		SampleList samplelist = this.findSampleListById(id);
		//3：执行删除
		this.getHibernateTemplate().delete(samplelist);
	}
}
