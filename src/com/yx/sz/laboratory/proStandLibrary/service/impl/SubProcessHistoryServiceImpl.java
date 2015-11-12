package com.yx.sz.laboratory.proStandLibrary.service.impl;

import java.util.List;

import com.yx.sz.laboratory.proStandLibrary.bean.SubProcessHistory;
import com.yx.sz.laboratory.proStandLibrary.dao.SubProcessHistoryDao;
import com.yx.sz.laboratory.proStandLibrary.service.SubProcessHistoryService;

public class SubProcessHistoryServiceImpl implements SubProcessHistoryService {

	private SubProcessHistoryDao subProcessHistoryDao;
	
	@Override
	public void updateSubProcessHistory(SubProcessHistory subProcessHistory) {
		this.subProcessHistoryDao.updateSubPorcessHistory(subProcessHistory);
	}

	@Override
	public void saveSubProcessHistory(SubProcessHistory subProcessHistory) {
		this.subProcessHistoryDao.saveSubPorcessHistory(subProcessHistory);
	}

	@Override
	public List getSubProcessHistoryList() {
		List<SubProcessHistory> list = this.subProcessHistoryDao.getSubPorcessHistoryList();
		return list;
	}

	@Override
	public SubProcessHistory getSubProcessHistory(int id) {
		SubProcessHistory subProcessHistory = this.subProcessHistoryDao.getSubProcessHistory(id);
		return subProcessHistory;
	}

	@Override
	public void delSubProcessHistory(int id) {
		this.subProcessHistoryDao.delSubProcessHistory(id);

	}

	@Override
	public SubProcessHistory getSubProcessHistoryListByCommentId(
			String commentId) {
		SubProcessHistory subProcessHistory = this.subProcessHistoryDao.getSubProcessHistoryListByCommentId(commentId);
		return subProcessHistory;
	}

	@Override
	public SubProcessHistory getSubProcessHistoryListByProInstanceIdAndTaskId(
			String proInstanceId, String taskId) {
		this.subProcessHistoryDao.getSubProcessHistoryListByProInstanceIdAndtaskId(proInstanceId, taskId);
		
		return null;
	}
	public SubProcessHistoryDao getSubProcessHistoryDao() {
		return subProcessHistoryDao;
	}

	public void setSubProcessHistoryDao(SubProcessHistoryDao subProcessHistoryDao) {
		this.subProcessHistoryDao = subProcessHistoryDao;
	}


}
