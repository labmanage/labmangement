package cn.itcast.ssh.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class XMLReaderUtil {
	public static String readAsStringValue(XSSFCell cell){
		
		String value = null;
		switch(cell.getCellType()){
			case XSSFCell.CELL_TYPE_BLANK:
				value = "";
				break;
			case XSSFCell.CELL_TYPE_BOOLEAN:
				value = String.valueOf(cell.getBooleanCellValue());
				break;
			case XSSFCell.CELL_TYPE_ERROR:
				value = cell.getErrorCellString();
				break;
			case XSSFCell.CELL_TYPE_NUMERIC:
				value = String.valueOf((int)cell.getNumericCellValue());
				break;
			case XSSFCell.CELL_TYPE_STRING:
				value = cell.getStringCellValue();
				break;
			default :
				break;
		}
		return value;
		
	}
}
