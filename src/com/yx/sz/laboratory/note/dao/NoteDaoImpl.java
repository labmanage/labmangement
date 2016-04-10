package com.yx.sz.laboratory.note.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yx.sz.laboratory.note.bean.NoteBean;

public class NoteDaoImpl extends HibernateDaoSupport implements NoteDao {

	@Override
	public List<NoteBean> list() {
		String hql = "FROM NoteBean nb order by nb.createTime desc";
		return (List<NoteBean>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public void save(NoteBean nb) {
		this.getHibernateTemplate().save(nb);
	}

	@Override
	public void delete(NoteBean nb) {

		this.getHibernateTemplate().delete(nb);
	}

	@Override
	public void edit(NoteBean nb) {
		this.getHibernateTemplate().update(nb);
	}

	@Override
	public NoteBean getByID(long id) {
		String hql = "FROM NoteBean nb where nb.id = ?";
		List<NoteBean> nbList = this.getHibernateTemplate().find(hql, id);
		NoteBean nb = null;
		if(null != nbList && nbList.size() > 0) {
			nb = nbList.get(0);
		}
		return nb;
		
	}

	@Override
	public List<NoteBean> find(NoteBean nb) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer hqlBuffer = new StringBuffer("FROM NoteBean nb where 1 = 1 ");
		if(null!=nb.getTitle()){
			hqlBuffer.append(" and nb.title like '%"+nb.getTitle()+"%' ");
		}
		if(null != nb.getStartTime()) {
			hqlBuffer.append(" and nb.createTime >  '" + format1.format(nb.getStartTime()) + "' ");
		}
		if( null != nb.getEndTime() ) {
			hqlBuffer.append(" and nb.createTime < '"+format1.format(nb.getEndTime())+"' ");
		}
		if(nb.getStatus() > -1){
				hqlBuffer.append(" and nb.status = '" + nb.getStatus()+"' ");
		}
		if(nb.getIsExpired() == 0){
			hqlBuffer.append(" and expireTime >= '"+format1.format(new Date())+"'");
		}else if(nb.getIsExpired() == 1){
			hqlBuffer.append(" and expireTime < '"+format1.format(new Date())+"'");
		}
		
		hqlBuffer.append(" order by createTime desc ");
		System.out.println(hqlBuffer.toString());
		
		List<NoteBean> nbList = this.getHibernateTemplate().find(hqlBuffer.toString());
		
		return nbList;
	}

}
