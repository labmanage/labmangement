package com.yx.sz.laboratory.proStandardLib.service;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.FileBean;

public interface IFileBeanService {
	void save(FileBean f);
	void delete(FileBean f);
	void update(FileBean f);
	List<FileBean> list();
	FileBean getById(long id);
}
