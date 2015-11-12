package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;

public interface CheckReportService {

	public void saveCheckReport(CheckReport checkReport);
	
	public void delCheckReport(int id);
	
	public CheckReport getCheckReport(int id);
	
	public List getCheckReportList();
	
	public void updateCheckReport(CheckReport checkReport);
	
	public int getTheSameCount(String chanpinMc);
	
	public List getCheckReportListBySampleListId(int sampleListId);
	
	public List getCheckReportListBySampleListIdAndExecutionId(int sampleListId,String executionId) ;

	public CheckReport getCheckReportListByProcessInstanceIdAndExecutionId(
			String processInstanceId, String executionId);
}
