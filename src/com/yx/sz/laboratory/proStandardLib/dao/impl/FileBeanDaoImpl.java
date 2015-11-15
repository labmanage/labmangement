package com.yx.sz.laboratory.proStandardLib.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.proStandardLib.bean.FileBean;
import com.yx.sz.laboratory.proStandardLib.dao.IFileBeanDao;

public class FileBeanDaoImpl extends HibernateDaoSupport implements IFileBeanDao {

	@Override
	public void save(FileBean f) {
		this.getHibernateTemplate().save(f);
	}

	@Override
	public void delete(FileBean f) {
		this.getHibernateTemplate().delete(f);
	}

	@Override
	public void update(FileBean f) {
		this.getHibernateTemplate().update(f);
	}

	@Override
	public List<FileBean> list() {
		return this.getHibernateTemplate().find("FROM FileBean f");
	}

	@Override
	public FileBean getById(long id) {
		List<FileBean> list = this.getHibernateTemplate().find("FROM FileBean f where f.id = ?",id);
		if(null!=list && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

}
