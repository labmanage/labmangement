package cn.itcast.ssh.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;


public class ReportGernerator {
	/**
	 * 畜产品和林业产品报告
	 * @throws Exception
	 */
	public void exportCattleOrForestReport() throws Exception{
		InputStream is = new FileInputStream("resource/cfTemplate.docx");
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
	
	
	
	
	
	/**
	 * 无公害产品报告
	 * @throws Exception
	 */
	public void exportPollutionFreeReport() throws Exception{
		InputStream is = new FileInputStream("resource/pfTemplate.docx");
		XWPFDocument doc = new XWPFDocument(is);
		XWPFTable baseInfoTable = doc.getTables().get(0);
		//产品名称
		baseInfoTable.getRow(0).getCell(1).setText("hello world001");
		//型号规格
		baseInfoTable.getRow(0).getCell(3).setText("第n页 共n页");
		//商标
		baseInfoTable.getRow(1).getCell(3).setText("第n页 共n页");
		//受检单位
		baseInfoTable.getRow(2).getCell(1).setText("hello world001");
		//检验类别
		baseInfoTable.getRow(2).getCell(3).setText("第n页 共n页");
		//生产单位
		baseInfoTable.getRow(3).getCell(1).setText("hello world001");
		//样品等级、状态
		baseInfoTable.getRow(3).getCell(3).setText("第n页 共n页");
		//抽样地点
		baseInfoTable.getRow(4).getCell(1).setText("hello world001");
		//抽样日期
		baseInfoTable.getRow(4).getCell(3).setText("第n页 共n页");
		//样品数量
		baseInfoTable.getRow(5).getCell(1).setText("hello world001");
		//抽样者
		baseInfoTable.getRow(5).getCell(3).setText("第n页 共n页");
		//抽样基数
		baseInfoTable.getRow(6).getCell(1).setText("hello world001");
		//原编号或生产日期
		baseInfoTable.getRow(6).getCell(3).setText("第n页 共n页");
		//检验依据
		baseInfoTable.getRow(7).getCell(1).setText("hello world001");
		//检验项目
		baseInfoTable.getRow(7).getCell(3).setText("第n页 共n页");
		//所用主要仪器
		baseInfoTable.getRow(8).getCell(1).setText("hello world001");
		//实验环境条件
		baseInfoTable.getRow(8).getCell(3).setText("第n页 共n页");
		//检验结论
		baseInfoTable.getRow(9).getCell(1).setText("hello world001");
		//备注
		baseInfoTable.getRow(9).getCell(1).setText("第n页 共n页");
		
		
		
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
		doc.write(new FileOutputStream(new File("pf.docx")));
	}
	
	public void exportQualityReport() throws Exception{
		InputStream is = new FileInputStream("resource/mTemplate.docx");
		XWPFDocument doc = new XWPFDocument(is);
		XWPFTable baseInfoTable = doc.getTables().get(0);
		//食品名称
		baseInfoTable.getRow(0).getCell(1).setText("hello world001");
		//商标
		baseInfoTable.getRow(0).getCell(3).setText("第n页 共n页");
		//型号规格
		baseInfoTable.getRow(0).getCell(5).setText("第n页 共n页");
		//生产/交工/购进日期/食品批号
		baseInfoTable.getRow(1).getCell(1).setText("第n页 共n页");
		//质量等级
		baseInfoTable.getRow(1).getCell(3).setText("hello world001");
		//被抽样单位名称
		baseInfoTable.getRow(2).getCell(1).setText("第n页 共n页");
		//联系电话
		baseInfoTable.getRow(2).getCell(3).setText("hello world001");
		//标示生产者名称
		baseInfoTable.getRow(3).getCell(1).setText("第n页 共n页");
		//联系电话
		baseInfoTable.getRow(3).getCell(3).setText("hello world001");
		//任务来源
		baseInfoTable.getRow(4).getCell(1).setText("第n页 共n页");
		//抽样人员
		baseInfoTable.getRow(4).getCell(3).setText("hello world001");
		//抽样日期
		baseInfoTable.getRow(5).getCell(1).setText("第n页 共n页");
		//样品到达日期
		baseInfoTable.getRow(5).getCell(3).setText("hello world001");
		//样品数量
		baseInfoTable.getRow(6).getCell(1).setText("第n页 共n页");
		//抽样基数
		baseInfoTable.getRow(6).getCell(3).setText("hello world001");
		//抽样单编号
		baseInfoTable.getRow(7).getCell(1).setText("第n页 共n页");
		//检查封样人员
		baseInfoTable.getRow(7).getCell(3).setText("hello world001");
		//抽样地点
		baseInfoTable.getRow(8).getCell(1).setText("第n页 共n页");
		//封样状态
		baseInfoTable.getRow(8).getCell(3).setText("hello world001");
		//检验项目
		baseInfoTable.getRow(9).getCell(1).setText("第n页 共n页");
		//检验依据
		baseInfoTable.getRow(10).getCell(1).setText("第n页 共n页");
		//检验结论
		baseInfoTable.getRow(11).getCell(1).setText("第n页 共n页");
		//备注
		baseInfoTable.getRow(12).getCell(1).setText("第n页 共n页");
		
		//检验项目
				XWPFTable itemTable = doc.getTables().get(1);
				XWPFTableRow headRole = itemTable.getRow(0);
				int maxIndex = 1;
				for(int i = 1 ; i < 51; i ++){
					XWPFTableRow row = itemTable.getRow(i);
					row.getCell(0).setText("hahahahahahahaha");
					row.getCell(1).setText("hahahahahahahaha");
					row.getCell(2).setText("hahahahahahahaha");
					row.getCell(3).setText("hahahahahahahaha");
					row.getCell(4).setText("hahahahahahahaha");
					maxIndex = i;
				}
				
				int rowCount = itemTable.getNumberOfRows()-maxIndex-1;
				for(int i = rowCount; i > 0; i--){
					itemTable.removeRow(i+maxIndex);
					System.out.println(i);
				}
				doc.write(new FileOutputStream(new File("mt.docx")));
		
	}
	
	public static void main(String[] args) throws Exception {
		ReportGernerator td = new ReportGernerator();
		td.exportCattleOrForestReport();
		td.exportPollutionFreeReport();
		td.exportQualityReport();
		
//		File f = new File("");
//		System.out.println(f.getAbsolutePath());
		
		
		
	}
}
