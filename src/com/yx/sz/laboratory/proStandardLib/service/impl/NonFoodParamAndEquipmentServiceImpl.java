package com.yx.sz.laboratory.proStandardLib.service.impl;

import java.util.List;

import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.dao.INonFoodParamAndEquipmentDao;
import com.yx.sz.laboratory.proStandardLib.service.NonFoodParamAndEquipmentService;

public class NonFoodParamAndEquipmentServiceImpl implements NonFoodParamAndEquipmentService{

	private INonFoodParamAndEquipmentDao nfpeDao;
	@Override
	public List<NonFoodParamAndEquipment> getAll() {
		return nfpeDao.getAll();
	}
	
	
	public INonFoodParamAndEquipmentDao getNfpeDao() {
		return nfpeDao;
	}
	public void setNfpeDao(INonFoodParamAndEquipmentDao nfpeDao) {
		this.nfpeDao = nfpeDao;
	}


	@Override
	public List<NonFoodParamAndEquipment> getTopAll() {
		return nfpeDao.getTopAll();
	}


	@Override
	public List<NonFoodParamAndEquipment> getByTop(NonFoodParamAndEquipment nfpe) {
		return nfpeDao.getByTop(nfpe);
	}


	@Override
	public void save(NonFoodParamAndEquipment fd) {
		nfpeDao.save(fd);
	}


	@Override
	public NonFoodParamAndEquipment getById(int id) {
		return nfpeDao.getById(id);
	}


	@Override
	public void update(NonFoodParamAndEquipment fd) {
		nfpeDao.update(fd);
	}


	@Override
	public void delete(NonFoodParamAndEquipment fd) {
		nfpeDao.delete(fd);
	}

	
}
