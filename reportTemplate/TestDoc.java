package docTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;


public class TestDoc {
	
	public void exportCattleOrForestReport() throws Exception{
		InputStream is = new FileInputStream("reportTemplate/cfTemplate.docx");
		XWPFDocument doc = new XWPFDocument(is);
		XWPFTable baseInfoTable = doc.getTables().get(0);
		
		baseInfoTable.getRow(0).getCell(0).setText("hello world001");
		baseInfoTable.getRow(0).getCell(1).setText("第n页 共n页");
		baseInfoTable.getRow(1).getCell(1).setText("hello world001");
		baseInfoTable.getRow(1).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(2).getCell(1).setText("hello world001");
		baseInfoTable.getRow(2).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(3).getCell(1).setText("hello world001");
		baseInfoTable.getRow(3).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(4).getCell(1).setText("hello world001");
		baseInfoTable.getRow(4).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(5).getCell(1).setText("hello world001");
		baseInfoTable.getRow(5).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(6).getCell(1).setText("hello world001");
		baseInfoTable.getRow(6).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(7).getCell(1).setText("hello world001");
		baseInfoTable.getRow(7).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(8).getCell(1).setText("hello world001");
		baseInfoTable.getRow(8).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(9).getCell(1).setText("hello world001");
		baseInfoTable.getRow(9).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(10).getCell(1).setText("hello world001");
		baseInfoTable.getRow(10).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(11).getCell(1).setText("hello world001");
		baseInfoTable.getRow(12).getCell(1).setText("hello world001");
		baseInfoTable.getRow(13).getCell(1).setText("hello world001");
		//结论
		//（检验专用章）
		//签发日期：   年   月  日

		baseInfoTable.getRow(14).getCell(1).setText("hello world001");
		baseInfoTable.getRow(15).getCell(1).setText("remark");
		//检验项目
		XWPFTable itemTable = doc.getTables().get(1);
		XWPFTableRow headRole = itemTable.getRow(0);
		int maxIndex = 1;
		for(int i = 1 ; i < 11; i ++){
			XWPFTableRow row = itemTable.getRow(i);
			row.getCell(0).setText("hahahahahahahaha");
			row.getCell(1).setText("hahahahahahahaha");
			row.getCell(2).setText("hahahahahahahaha");
			row.getCell(3).setText("hahahahahahahaha");
			row.getCell(4).setText("hahahahahahahaha");
			System.out.println(maxIndex);
			maxIndex = i;
		}
		
		int rowCount = itemTable.getNumberOfRows()-maxIndex-1;
		for(int i = rowCount; i > 0; i--){
			itemTable.removeRow(i+maxIndex);
			System.out.println(i);
		}
		doc.write(new FileOutputStream(new File("haha.docx")));
	}
	
	
	
	public void exportPollutionFreeReport() throws Exception{
		InputStream is = new FileInputStream("reportTemplate/pfTemplate.docx");
		XWPFDocument doc = new XWPFDocument(is);
		XWPFTable baseInfoTable = doc.getTables().get(0);
		
		baseInfoTable.getRow(0).getCell(0).setText("hello world001");
		baseInfoTable.getRow(0).getCell(1).setText("第n页 共n页");
		baseInfoTable.getRow(1).getCell(1).setText("hello world001");
		baseInfoTable.getRow(1).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(2).getCell(1).setText("hello world001");
		baseInfoTable.getRow(2).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(3).getCell(1).setText("hello world001");
		baseInfoTable.getRow(3).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(4).getCell(1).setText("hello world001");
		baseInfoTable.getRow(4).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(5).getCell(1).setText("hello world001");
		baseInfoTable.getRow(5).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(6).getCell(1).setText("hello world001");
		baseInfoTable.getRow(6).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(7).getCell(1).setText("hello world001");
		baseInfoTable.getRow(7).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(8).getCell(1).setText("hello world001");
		baseInfoTable.getRow(8).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(9).getCell(1).setText("hello world001");
		baseInfoTable.getRow(9).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(10).getCell(1).setText("hello world001");
		baseInfoTable.getRow(10).getCell(3).setText("第n页 共n页");
		baseInfoTable.getRow(11).getCell(1).setText("hello world001");
		baseInfoTable.getRow(12).getCell(1).setText("hello world001");
		baseInfoTable.getRow(13).getCell(1).setText("hello world001");
		//结论
		//（检验专用章）
		//签发日期：   年   月  日

		baseInfoTable.getRow(14).getCell(1).setText("hello world001");
		baseInfoTable.getRow(15).getCell(1).setText("remark");
		//检验项目
		XWPFTable itemTable = doc.getTables().get(1);
		XWPFTableRow headRole = itemTable.getRow(0);
		int maxIndex = 1;
		for(int i = 1 ; i < 11; i ++){
			XWPFTableRow row = itemTable.getRow(i);
			row.getCell(0).setText("hahahahahahahaha");
			row.getCell(1).setText("hahahahahahahaha");
			row.getCell(2).setText("hahahahahahahaha");
			row.getCell(3).setText("hahahahahahahaha");
			row.getCell(4).setText("hahahahahahahaha");
			System.out.println(maxIndex);
			maxIndex = i;
		}
		
		int rowCount = itemTable.getNumberOfRows()-maxIndex-1;
		for(int i = rowCount; i > 0; i--){
			itemTable.removeRow(i+maxIndex);
			System.out.println(i);
		}
		doc.write(new FileOutputStream(new File("haha.docx")));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void testReadByDoc() throws Exception{
		InputStream is = new FileInputStream("reportTemplate/cfTemplate.docx");
		XWPFDocument doc = new XWPFDocument(is);
		XWPFTable table = doc.getTables().get(1);
		int rowCount = table.getNumberOfRows();
		for(int i = 0 ; i < rowCount; i++){
			XWPFTableRow row =  table.getRow(i);
			int colNum = row.getTableCells().size();
			for(int j = 0; j < colNum; j++){
				System.out.println(row.getCell(j).getText());
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		TestDoc td = new TestDoc();
		td.exportCattleOrForestReport();
	}
}
