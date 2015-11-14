package com.yx.sz.laboratory.workflow.service.impl;

import java.util.List;

import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;
import com.yx.sz.laboratory.workflow.dao.IPollutionFreeSampleListDao;
import com.yx.sz.laboratory.workflow.service.IPollutionFreeSampleListService;

public class PollutionFreeSampleListServiceImpl implements IPollutionFreeSampleListService{

	private IPollutionFreeSampleListDao pollutionFreeDao;
	@Override
	public List<PollutionFreeSampleList> list() {
		return pollutionFreeDao.list();
	}

	@Override
	public PollutionFreeSampleList findById(long id) {
		return pollutionFreeDao.getById(id);
	}

	@Override
	public void save(PollutionFreeSampleList sl) {
		pollutionFreeDao.save(sl);
	}

	@Override
	public void delete(PollutionFreeSampleList sl) {
		pollutionFreeDao.delete(sl);
	}

	@Override
	public void update(PollutionFreeSampleList sl) {
		pollutionFreeDao.update(sl);
	}

	public IPollutionFreeSampleListDao getPollutionFreeDao() {
		return pollutionFreeDao;
	}

	public void setPollutionFreeDao(IPollutionFreeSampleListDao pollutionFreeDao) {
		this.pollutionFreeDao = pollutionFreeDao;
	}


}
