package com.yx.sz.laboratory.instrumenttation.service;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yx.sz.laboratory.instrumenttation.bean.InstrumentTation;
import com.yx.sz.laboratory.instrumenttation.dao.InstrumentTationDao;

public class InstrumentTationServiceImpl implements InstrumentTationService {

	private InstrumentTationDao instrumentTationDao ;

	@Override
	public void updateInstrumentTation(InstrumentTation instrumentTation) {
		this.instrumentTationDao.updaInstrumentTation(instrumentTation);
	}

	@Override
	public void saveInstrumentTation(InstrumentTation instrumentTation) {
		this.instrumentTationDao.saveInstrumentTation(instrumentTation);
	}

	@Override
	public void delInstrumentTation(InstrumentTation instrumentTation) {
		this.instrumentTationDao.delInstrumentTation(instrumentTation);
	}

	@Override
	public List getInstrumentTationByprocDefinitionId() {
		List list = this.instrumentTationDao.getInstrumentTationList();
		return list;
	}

	@Override
	public InstrumentTation getInstrumentTationById(int id) {
		InstrumentTation instrumentTation = this.instrumentTationDao.getInstrumentTationById(id);
		return instrumentTation;
	}
		
	public InstrumentTationDao getInstrumentTationDao() {
		return instrumentTationDao;
	}

	public void setInstrumentTationDao(InstrumentTationDao instrumentTationDao) {
		this.instrumentTationDao = instrumentTationDao;
	}

}
