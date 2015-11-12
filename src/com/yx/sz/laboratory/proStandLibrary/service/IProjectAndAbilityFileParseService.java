package com.yx.sz.laboratory.proStandLibrary.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.yx.sz.laboratory.proStandardLib.bean.FoodParam;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;
import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParam;
import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParamAndEquipment;

public interface IProjectAndAbilityFileParseService {
	/**
	 * 读取食品标准
	 * @param xwb
	 * @return List<FoodStandard>
	 */
	public List<FoodStandard> readFoodStandardContent(XSSFWorkbook xwb) throws IOException;
	
	/**
	 * 读取食品类参数限值及设备表
	 * @param xwb
	 * @return
	 */
	public List<FoodParamAndEquipment> readFoodParamAndEquipmentContent(XSSFWorkbook xwb) throws IOException;
	
	/**
	 * 读取食品类参数表
	 * @param xwb
	 * @return
	 */
	public List<FoodParam> readFoodParamContent(XSSFWorkbook xwb) throws IOException;
	
	/**
	 * 非食品类参数限值及设备表
	 * @param xwb
	 * @return
	 */
	public List<NonFoodParamAndEquipment> readNonFoodParamAndEquipmentContent(XSSFWorkbook xwb) throws IOException;
	
	/**
	 * 读取非食品类参数表
	 * @param xwb
	 * @return
	 */
	public List<NonFoodParam> readNonFoodParamContent(XSSFWorkbook xwb) throws IOException;
	
	/**
	 * 将所有的记录保存到数据库
	 * @param xwb
	 * @throws IOException
	 */
	public void readSaveAll(XSSFWorkbook xwb) throws IOException;
}
