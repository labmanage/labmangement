package com.yx.sz.laboratory.proStandLibrary.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.proStandLibrary.bean.SubProcessHistory;

public interface SubProcessHistoryDao {

	public void updateSubPorcessHistory(SubProcessHistory subProcessHistory);
	
	public void saveSubPorcessHistory(SubProcessHistory subProcessHistory);
	
	public List getSubPorcessHistoryList();
	
	public SubProcessHistory getSubProcessHistory(int id);
	
	public void delSubProcessHistory(int id);
	
	public SubProcessHistory getSubProcessHistoryListByCommentId(String commentId);
	
	public SubProcessHistory getSubProcessHistoryListByProInstanceIdAndtaskId(
			String proInstanceId, String taskId);
	
}
