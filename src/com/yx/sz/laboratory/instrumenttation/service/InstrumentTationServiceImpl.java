package com.yx.sz.laboratory.instrumenttation.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.utils.XMLReaderUtil;

import com.yx.sz.laboratory.instrumenttation.bean.InstrumentTation;
import com.yx.sz.laboratory.instrumenttation.dao.InstrumentTationDao;
import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;

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

	@Override
	public void importDataFromXSSFWorkbook(XSSFWorkbook xwb) {
		List<InstrumentTation> itList = new ArrayList<InstrumentTation>();
		XSSFSheet sheet = xwb.getSheetAt(0);
		int rowNum = sheet.getPhysicalNumberOfRows();
		for(int i = 2; i < rowNum; i ++){
			XSSFRow row = sheet.getRow(i);
			InstrumentTation it = new InstrumentTation();
			it.setYqsbmc(XMLReaderUtil.readAsStringValue(row.getCell(1)));
			it.setXhgg(XMLReaderUtil.readAsStringValue(row.getCell(2)));
			it.setZqddj(XMLReaderUtil.readAsStringValue(row.getCell(3)));
			it.setFbl(XMLReaderUtil.readAsStringValue(row.getCell(4)));
			it.setScqy(XMLReaderUtil.readAsStringValue(row.getCell(5)));
			it.setJddw(XMLReaderUtil.readAsStringValue(row.getCell(6)));
			it.setJdny1(XMLReaderUtil.readAsStringValue(row.getCell(7)));
			it.setJdny2(XMLReaderUtil.readAsStringValue(row.getCell(8)));
			it.setJdny3(XMLReaderUtil.readAsStringValue(row.getCell(9)));
			it.setBz(XMLReaderUtil.readAsStringValue(row.getCell(10)));
			itList.add(it);
				
			}
		instrumentTationDao.batchSave(itList);
	}

}
