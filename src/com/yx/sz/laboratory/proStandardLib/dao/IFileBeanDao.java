package com.yx.sz.laboratory.proStandardLib.dao;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FileBean;

public interface IFileBeanDao {
	void save(FileBean f);
	void delete(FileBean f);
	void update(FileBean f);
	List<FileBean> list();
	FileBean getById(long id);
}
