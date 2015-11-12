package com.yx.sz.laboratory.proStandLibrary.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;

public interface CheckReportDao {

	public void updateCheckReport(CheckReport checkReport);
	
	public void saveCheckReport(CheckReport checkReport);
	
	public List getCheckReportList();
	
	public CheckReport getCheckReport(int id);
	
	public void delCheckReport(int id);
	
	public int getTheSameCount(String chanpinMc,String hql);
	
	public List getCheckReportListBySampleListId(int sampleListId,String hql);
	
	public List getCheckReportListBySampleListIdAndExecutionId(int sampleListId,String executionId,String hql);
	
	public CheckReport getCheckReportListByProcessInstanceIdAndExecutionId(String processInstanceId,String executionId,String hql); 
}
