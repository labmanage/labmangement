package com.yx.sz.laboratory.proStandardLib.service.impl;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FileBean;
import com.yx.sz.laboratory.proStandardLib.dao.IFileBeanDao;
import com.yx.sz.laboratory.proStandardLib.service.IFileBeanService;

public class FileBeanServiceImpl implements IFileBeanService {

	private IFileBeanDao fileBeanDao;
	@Override
	public void save(FileBean f) {
		fileBeanDao.save(f);
	}

	@Override
	public void delete(FileBean f) {
		fileBeanDao.delete(f);
	}

	@Override
	public void update(FileBean f) {
		fileBeanDao.update(f);
	}

	@Override
	public List<FileBean> list() {
		return fileBeanDao.list();
	}

	@Override
	public FileBean getById(long id) {
		return fileBeanDao.getById(id);
	}

	public IFileBeanDao getFileBeanDao() {
		return fileBeanDao;
	}

	public void setFileBeanDao(IFileBeanDao fileBeanDao) {
		this.fileBeanDao = fileBeanDao;
	}

	

}
