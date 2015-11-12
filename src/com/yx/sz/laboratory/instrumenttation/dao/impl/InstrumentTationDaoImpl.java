package com.yx.sz.laboratory.instrumenttation.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yx.sz.laboratory.instrumenttation.bean.InstrumentTation;
import com.yx.sz.laboratory.instrumenttation.dao.InstrumentTationDao;

public class InstrumentTationDaoImpl extends HibernateDaoSupport implements
		InstrumentTationDao {

	@Override
	public void updaInstrumentTation(InstrumentTation instrumentTation) {
		this.getHibernateTemplate().update(instrumentTation);
	}

	@Override
	public void saveInstrumentTation(InstrumentTation instrumentTation) {
		this.getHibernateTemplate().save(instrumentTation);
	}

	@Override
	public void delInstrumentTation(InstrumentTation instrumentTation) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(instrumentTation.getClass(),
						instrumentTation.getId()));

	}

	@Override
	public InstrumentTation getInstrumentTationById(int id) {
		String hql = "from InstrumentTation o where o.id=?";

		List<InstrumentTation> list = this.getHibernateTemplate().find(hql, id);
		InstrumentTation instrumentTation = new InstrumentTation();
		if (list != null && list.size() > 0) {
			instrumentTation = list.get(0);
		}

		return instrumentTation;
	}

	@Override
	public List getInstrumentTationList() {
		String hql = "from InstrumentTation";
		List<InstrumentTation> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
