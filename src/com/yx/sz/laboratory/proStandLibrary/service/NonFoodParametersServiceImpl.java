package com.yx.sz.laboratory.proStandLibrary.service;

import java.util.List;
import com.yx.sz.laboratory.proStandLibrary.bean.NonFoodParameters;
import com.yx.sz.laboratory.proStandLibrary.dao.NonFoodParametersDao;

public class NonFoodParametersServiceImpl implements NonFoodParametersService {

	private NonFoodParametersDao nonFoodParametersDao ;

	@Override
	public void updateNonFoodParameters(NonFoodParameters nonFoodParameters) {
		this.nonFoodParametersDao.updaNonFoodParameters(nonFoodParameters);
	}

	@Override
	public void saveNonFoodParameters(NonFoodParameters nonFoodParameters) {
		this.nonFoodParametersDao.saveNonFoodParameters(nonFoodParameters);
	}

	@Override
	public void delNonFoodParameters(NonFoodParameters nonFoodParameters) {
		this.nonFoodParametersDao.delNonFoodParameters(nonFoodParameters);
	}

	@Override
	public List getNonFoodParametersByprocDefinitionId() {
		List list = this.nonFoodParametersDao.getNonFoodParametersList();
		return list;
	}

	@Override
	public NonFoodParameters getNonFoodParametersById(int id) {
		NonFoodParameters nonFoodParameters = this.nonFoodParametersDao.getNonFoodParametersById(id);
		return nonFoodParameters;
	}

	public NonFoodParametersDao getNonFoodParametersDao() {
		return nonFoodParametersDao;
	}

	public void setNonFoodParametersDao(NonFoodParametersDao nonFoodParametersDao) {
		this.nonFoodParametersDao = nonFoodParametersDao;
	}

}
