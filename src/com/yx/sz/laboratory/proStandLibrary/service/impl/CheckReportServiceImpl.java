package com.yx.sz.laboratory.proStandLibrary.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.proStandLibrary.dao.CheckReportDao;
import com.yx.sz.laboratory.proStandLibrary.service.CheckReportService;

public class CheckReportServiceImpl implements CheckReportService {

	private CheckReportDao checkReportDao;
	
	@Override
	public void saveCheckReport(CheckReport checkReport) {
		this.checkReportDao.saveCheckReport(checkReport);

	}

	@Override
	public void delCheckReport(int id) {
		this.checkReportDao.delCheckReport(id);

	}

	@Override
	public CheckReport getCheckReport(int id) {
		
		CheckReport checkReport = this.checkReportDao.getCheckReport(id);
		
		return checkReport;
	}

	@Override
	public List getCheckReportList() {
		
		List<CheckReport> list = this.checkReportDao.getCheckReportList();
		
		return list;
	}
	
	@Override
	public int getTheSameCount(String chanpinMc) {
		
		//int n = 0;
		String hql = "from CheckReport where chanpinMc=?";
		
		int n = this.checkReportDao.getTheSameCount(chanpinMc, hql);
		
		return n;
	}
	
	@Override
	public List getCheckReportListBySampleListId(int sampleListId) {
		String hql = "from CheckReport where sampleListId=?";
		List<CheckReport> list = new ArrayList<CheckReport>();
		List checkReportListBySampleListId = this.checkReportDao.getCheckReportListBySampleListId(sampleListId, hql);
		list = checkReportListBySampleListId;
		return list;
	}
	@Override
	public List getCheckReportListBySampleListIdAndExecutionId(int sampleListId,String executionId) {
		String hql = "from CheckReport where sampleListId=? and executionId=?";
		List<CheckReport> list = new ArrayList<CheckReport>();
		List checkReportListBySampleListId = this.checkReportDao.getCheckReportListBySampleListIdAndExecutionId(sampleListId, executionId, hql);
		list = checkReportListBySampleListId;
		return list;
	}
	
	@Override
	public CheckReport getCheckReportListByProcessInstanceIdAndExecutionId(
			String processInstanceId, String executionId) {
		
		String hql = "from CheckReport where proInstanceId=? and executionId=?";
		List<CheckReport> list = new ArrayList<CheckReport>();
		CheckReport checkReport  = this.checkReportDao.getCheckReportListByProcessInstanceIdAndExecutionId(processInstanceId, executionId, hql);
		return checkReport;
	}

	@Override
	public void updateCheckReport(CheckReport checkReport) {
		this.checkReportDao.updateCheckReport(checkReport);

	}

	public CheckReportDao getCheckReportDao() {
		return checkReportDao;
	}

	public void setCheckReportDao(CheckReportDao checkReportDao) {
		this.checkReportDao = checkReportDao;
	}
}
