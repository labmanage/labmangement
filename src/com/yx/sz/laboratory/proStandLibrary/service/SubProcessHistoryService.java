package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.SubProcessHistory;

public interface SubProcessHistoryService {

public void updateSubProcessHistory(SubProcessHistory subProcessHistory);
	
	public void saveSubProcessHistory(SubProcessHistory subProcessHistory);
	
	public List getSubProcessHistoryList();
	
	public SubProcessHistory getSubProcessHistory(int id);
	
	public void delSubProcessHistory(int id);
	
	public SubProcessHistory getSubProcessHistoryListByCommentId(String commentId);
	
	public SubProcessHistory getSubProcessHistoryListByProInstanceIdAndTaskId(String proInstanceId,String taskId);

}
