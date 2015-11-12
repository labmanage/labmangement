package com.yx.sz.laboratory.proStandLibrary.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.itcast.ssh.utils.XMLReaderUtil;

import com.yx.sz.laboratory.proStandLibrary.service.IProjectAndAbilityFileParseService;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParam;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.bean.FoodStandard;
import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParam;
import com.yx.sz.laboratory.proStandardLib.bean.NonFoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.dao.*;
@SuppressWarnings("unused")
public class ProjectAndAbilityFileParseServiceImpl implements IProjectAndAbilityFileParseService {
	
	
	private IProductStandardDao psDao;
	private IFoodParamDao fpDao;
	private IFoodParamAndEquipmentDao fpeDao;
	private INonFoodParamDao nfpDao;
	private INonFoodParamAndEquipmentDao nfpeDao;
	
	
	public List<FoodStandard> readFoodStandardContent(XSSFWorkbook xwb) throws IOException {
		List<FoodStandard> fsList = new ArrayList<FoodStandard>();
		XSSFSheet sheet = xwb.getSheetAt(0);
		int rowNum = sheet.getPhysicalNumberOfRows();
		for(int i = 1; i < rowNum; i ++){
			XSSFRow row = sheet.getRow(i);
			FoodStandard fs = new FoodStandard();
			fs.setId(i);
			fs.setSequence(Integer.parseInt(XMLReaderUtil.readAsStringValue(row.getCell(1))));
			fs.setName(XMLReaderUtil.readAsStringValue(row.getCell(2)));
			fs.setCategory(XMLReaderUtil.readAsStringValue(row.getCell(0)));
			fs.setStandardCode(XMLReaderUtil.readAsStringValue(row.getCell(3)));
			fs.setStandardName(XMLReaderUtil.readAsStringValue(row.getCell(4)));
			fs.setLimitAndDesc(XMLReaderUtil.readAsStringValue(row.getCell(5)));
			fs.setRemark(XMLReaderUtil.readAsStringValue(row.getCell(6)));
			fsList.add(fs);
				
			}
		return fsList;
	}
	
	public List<FoodParamAndEquipment> readFoodParamAndEquipmentContent(XSSFWorkbook xwb) throws IOException{
		XSSFSheet sheet= xwb.getSheetAt(1);
		int rowNum = sheet.getPhysicalNumberOfRows();
		List<FoodParamAndEquipment> list = new ArrayList<FoodParamAndEquipment>();
		String sequence = "1";
		String foodName = "";
		for(int i = 1 ; i  <  rowNum; i ++){
			XSSFRow row = sheet.getRow(i);
			FoodParamAndEquipment fpe = new FoodParamAndEquipment();
			fpe.setId(i);
			String tempSeq = XMLReaderUtil.readAsStringValue(row.getCell(0));
			if(tempSeq.length() > 0 ){
				sequence = tempSeq;
			}
			fpe.setSequence(Integer.parseInt(sequence));
			
			String tempFoodName = XMLReaderUtil.readAsStringValue(row.getCell(1));
			if(tempFoodName.length() > 0){
				foodName = tempFoodName;
			}
			fpe.setFoodName(foodName);
			fpe.setParamName(XMLReaderUtil.readAsStringValue(row.getCell(2)));
			fpe.setLimit(XMLReaderUtil.readAsStringValue(row.getCell(3)));
			fpe.setEquipment(XMLReaderUtil.readAsStringValue(row.getCell(4)));
			fpe.setResolution(XMLReaderUtil.readAsStringValue(row.getCell(5)));
			fpe.setRange(XMLReaderUtil.readAsStringValue(row.getCell(6)));
			fpe.setAccuracy(XMLReaderUtil.readAsStringValue(row.getCell(7)));
			fpe.setCanCheckAndShouldCheck(XMLReaderUtil.readAsStringValue(row.getCell(8)));
			fpe.setRate(XMLReaderUtil.readAsStringValue(row.getCell(9)));
			fpe.setRemark(XMLReaderUtil.readAsStringValue(row.getCell(10)));
			list.add(fpe);
		}
		return list;
	}
	
	public List<FoodParam> readFoodParamContent(XSSFWorkbook xwb) throws IOException {
		List<FoodParam> list = new ArrayList<FoodParam>();
		XSSFSheet sheet = xwb.getSheetAt(2);
		int rowNum = sheet.getPhysicalNumberOfRows();
		String projectSeq = "";
		String productName = "";
		for(int i = 1; i < rowNum; i ++){
			XSSFRow row = sheet.getRow(i);
			FoodParam fp = new FoodParam();
			fp.setId(i);
			String tempProjectSeq = XMLReaderUtil.readAsStringValue(row.getCell(0));
			if(tempProjectSeq.length() > 0){
				projectSeq = tempProjectSeq;
			}
			fp.setProjectSeq(Integer.parseInt(projectSeq));
			String tempProductName = XMLReaderUtil.readAsStringValue(row.getCell(1));
			if(tempProductName.length() > 0 ){
				productName = tempProductName;
			}
			fp.setProductName(productName);
			fp.setParamSeq(XMLReaderUtil.readAsStringValue(row.getCell(2)));
			fp.setProjectName(XMLReaderUtil.readAsStringValue(row.getCell(3)));
			fp.setStandardCode(XMLReaderUtil.readAsStringValue(row.getCell(4)));
			fp.setStandardName(XMLReaderUtil.readAsStringValue(row.getCell(5)));
			fp.setLimitAndDesc(XMLReaderUtil.readAsStringValue(row.getCell(6)));
			fp.setRemark(XMLReaderUtil.readAsStringValue(row.getCell(7)));
			list.add(fp);
		}
		return list;
	}
	
	public List<NonFoodParamAndEquipment> readNonFoodParamAndEquipmentContent(XSSFWorkbook xwb) throws IOException {
		List<NonFoodParamAndEquipment> list = new ArrayList<NonFoodParamAndEquipment>();
		XSSFSheet sheet = xwb.getSheetAt(3);
		int rowCount = sheet.getPhysicalNumberOfRows();
		String seq = "";
		String productName = "";
		for(int i = 1 ; i < rowCount; i ++){
			NonFoodParamAndEquipment nfpe = new NonFoodParamAndEquipment();
			XSSFRow row = sheet.getRow(i);
			nfpe.setId(i);
			String tempSeq = XMLReaderUtil.readAsStringValue(row.getCell(0));
			if(tempSeq.length() > 0){
				seq = tempSeq;
			}
			nfpe.setSeq(Integer.parseInt(seq));
			String tempProductName = XMLReaderUtil.readAsStringValue(row.getCell(1));
			if(tempProductName.length() > 0){
				productName = tempProductName;
			}
			nfpe.setProductName(productName);
			nfpe.setParamName(XMLReaderUtil.readAsStringValue(row.getCell(2)));
			nfpe.setLimit(XMLReaderUtil.readAsStringValue(row.getCell(3)));
			nfpe.setEquipment(XMLReaderUtil.readAsStringValue(row.getCell(4)));
			nfpe.setRange(XMLReaderUtil.readAsStringValue(row.getCell(5)));
			nfpe.setCurracyLevel(XMLReaderUtil.readAsStringValue(row.getCell(6)));
			nfpe.setResolution(XMLReaderUtil.readAsStringValue(row.getCell(7)));
			nfpe.setCanCheckAndShouldCheck(XMLReaderUtil.readAsStringValue(row.getCell(8)));
			nfpe.setRate(XMLReaderUtil.readAsStringValue(row.getCell(9)));
			nfpe.setRemark(XMLReaderUtil.readAsStringValue(row.getCell(10)));
			list.add(nfpe);
		}
		return list;
	}
	
	public List<NonFoodParam> readNonFoodParamContent(XSSFWorkbook xwb) throws IOException{
		List<NonFoodParam> list = new ArrayList<NonFoodParam>();
		XSSFSheet sheet = xwb.getSheetAt(4);
		int rowNum = sheet.getPhysicalNumberOfRows();
		String productSeq = "1";
		for(int i = 1; i < rowNum; i++){
			NonFoodParam nfp = new NonFoodParam();
			XSSFRow row = sheet.getRow(i);
			nfp.setId(i);
			String tempProductSeq = XMLReaderUtil.readAsStringValue(row.getCell(0));
			if(tempProductSeq.length() > 0){
				productSeq = tempProductSeq;
			}
			nfp.setProductSeq(Integer.parseInt(productSeq));
			nfp.setParamSeq(XMLReaderUtil.readAsStringValue(row.getCell(1)));
			nfp.setProjectName(XMLReaderUtil.readAsStringValue(row.getCell(2)));
			nfp.setStandardCode(XMLReaderUtil.readAsStringValue(row.getCell(3)));
			nfp.setStandardName(XMLReaderUtil.readAsStringValue(row.getCell(4)));
			nfp.setLimitAndDesc(XMLReaderUtil.readAsStringValue(row.getCell(5)));
			nfp.setRemark(XMLReaderUtil.readAsStringValue(row.getCell(6)));
			list.add(nfp);
		}
		return list;
	}

	@Override
	public void readSaveAll(XSSFWorkbook xwb) throws IOException {
		List<FoodStandard> fsList = this.readFoodStandardContent(xwb);
		List<FoodParam> fpList = this.readFoodParamContent(xwb);
		List<FoodParamAndEquipment> fpeList = this.readFoodParamAndEquipmentContent(xwb);
		List<NonFoodParam> nfpList = this.readNonFoodParamContent(xwb);
		List<NonFoodParamAndEquipment> nfpeList = this.readNonFoodParamAndEquipmentContent(xwb);
		psDao.batchSave(fsList);
		fpDao.batchSave(fpList);
		fpeDao.batchSave(fpeList);
		nfpDao.batchSave(nfpList);
		nfpeDao.batchSave(nfpeList);
	}

	public IProductStandardDao getPsDao() {
		return psDao;
	}

	public void setPsDao(IProductStandardDao psDao) {
		this.psDao = psDao;
	}

	public IFoodParamDao getFpDao() {
		return fpDao;
	}

	public void setFpDao(IFoodParamDao fpDao) {
		this.fpDao = fpDao;
	}

	public IFoodParamAndEquipmentDao getFpeDao() {
		return fpeDao;
	}

	public void setFpeDao(IFoodParamAndEquipmentDao fpeDao) {
		this.fpeDao = fpeDao;
	}

	public INonFoodParamDao getNfpDao() {
		return nfpDao;
	}

	public void setNfpDao(INonFoodParamDao nfpDao) {
		this.nfpDao = nfpDao;
	}

	public INonFoodParamAndEquipmentDao getNfpeDao() {
		return nfpeDao;
	}

	public void setNfpeDao(INonFoodParamAndEquipmentDao nfpeDao) {
		this.nfpeDao = nfpeDao;
	}
	
	
}
