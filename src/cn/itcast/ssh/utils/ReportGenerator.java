package cn.itcast.ssh.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.struts2.ServletActionContext;

import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.workflow.bean.CattleSampleList;
import com.yx.sz.laboratory.workflow.bean.ForestFoodSampleList;
import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;
import com.yx.sz.laboratory.workflow.bean.QualitySampleList;


public class ReportGenerator {
	
	
	/**
	 * 畜产品报告
	 * @throws Exception
	 */
	public static InputStream exportCattleReport(CattleSampleList cList, List<CheckReport> rList) throws Exception{
		
		InputStream is = ServletActionContext.getServletContext().getResourceAsStream("/reportTemplates/cfTemplate.docx"); 
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
		ByteArrayOutputStream os = null;
		 doc.write(os);
		 ByteArrayInputStream bis = new ByteArrayInputStream(os.toByteArray());
		 return bis;
//		doc.write(new FileOutputStream(new File("haha.docx")));
	}
	
	
	/**
	 * 林业产品报告
	 * @param cList
	 * @param rList
	 * @throws Exception
	 */
	public static InputStream exportForestReport(ForestFoodSampleList cList, List<CheckReport> rList) throws Exception{
		
		//InputStream is = new FileInputStream("/reportTemplates/cfTemplate.docx");
		InputStream is = ServletActionContext.getServletContext().getResourceAsStream("/reportTemplates/cfTemplate.docx"); 
		XWPFDocument doc = new XWPFDocument(is);
		XWPFTable baseInfoTable = doc.getTables().get(0);
		//编号
		baseInfoTable.getRow(0).getCell(0).setText("hello world001");
		//第n页
		baseInfoTable.getRow(0).getCell(1).setText("第n页 共n页");
		//样品名称
		baseInfoTable.getRow(1).getCell(1).setText(cList.getName());
		//检验类别
		baseInfoTable.getRow(1).getCell(3).setText(cList.getCheckType());
		//受检单位
		baseInfoTable.getRow(2).getCell(1).setText(cList.getCheckPlace());
		//型号规格
		baseInfoTable.getRow(2).getCell(3).setText(cList.getType());
		//标示生产单位
		baseInfoTable.getRow(3).getCell(1).setText("/");
		//样品等级
		baseInfoTable.getRow(3).getCell(3).setText("/");
		//送检单位地址
		baseInfoTable.getRow(4).getCell(1).setText(cList.getComName());
		//商标
		baseInfoTable.getRow(4).getCell(3).setText(cList.getBrand());
		//抽样地点
		baseInfoTable.getRow(5).getCell(1).setText(cList.getPlace());
		//抽样人员
		baseInfoTable.getRow(5).getCell(3).setText(cList.getUserName());
		//抽样基数
		baseInfoTable.getRow(6).getCell(1).setText("/");
		//接样日期	
		baseInfoTable.getRow(6).getCell(3).setText("/");
		//样品数量
		baseInfoTable.getRow(7).getCell(1).setText(cList.getSampleQuantity()+"");
		//生产日期
		baseInfoTable.getRow(7).getCell(3).setText("/");
		//样品特性和状态
		baseInfoTable.getRow(8).getCell(1).setText("/");
		//样品批号
		baseInfoTable.getRow(8).getCell(3).setText("/");
		//样品编号
		baseInfoTable.getRow(9).getCell(1).setText(cList.getSampleListNum());
		//检验日期
		baseInfoTable.getRow(9).getCell(3).setText(cList.getSampleDate());
		//检验环境
		baseInfoTable.getRow(10).getCell(1).setText("/");
		//检测仪器
		baseInfoTable.getRow(10).getCell(3).setText("/");
		///检验依据
		baseInfoTable.getRow(11).getCell(1).setText("/");
		//判定依据
		baseInfoTable.getRow(12).getCell(1).setText("/");
		//检验项目
		baseInfoTable.getRow(13).getCell(1).setText("/");
		//结论
		//（检验专用章）
		//签发日期：   年   月  日

		baseInfoTable.getRow(14).getCell(1).setText("/");
		//
		baseInfoTable.getRow(15).getCell(1).setText(cList.getRemark());
		//检验项目
		XWPFTable itemTable = doc.getTables().get(1);
		int maxIndex = 1;
		for(CheckReport cr: rList){
			XWPFTableRow row = itemTable.getRow(maxIndex);
			row.getCell(0).setText(cr.getParamName());
			row.getCell(1).setText(cr.getUnit());
			row.getCell(2).setText(cr.getLimit());
			row.getCell(3).setText(cr.getResultValue());
			row.getCell(4).setText(cr.getSingleResult());
			maxIndex ++;
		}
		int rowCount = itemTable.getNumberOfRows()-maxIndex-1;
		for(int i = rowCount; i > 0; i--){
			itemTable.removeRow(i+maxIndex);
			System.out.println(i);
		}
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		doc.write(os);
		ByteArrayInputStream bis = new ByteArrayInputStream(os.toByteArray());
		return bis;
	}
	
	
	/**
	 * 无公害产品报告
	 * @throws Exception
	 */
	public static InputStream exportPollutionFreeReport(PollutionFreeSampleList sList, List<CheckReport> rList) throws Exception{
		InputStream is = ServletActionContext.getServletContext().getResourceAsStream("/reportTemplates/pfTemplate.docx"); 
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
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		doc.write(os);
		ByteArrayInputStream bis = new ByteArrayInputStream(os.toByteArray());
		return bis;
	}
	
	/**
	 * 食品检测中心报告
	 * @param sList
	 * @param rList
	 * @throws Exception
	 */
	public static InputStream exportQualityReport(QualitySampleList sList, List<CheckReport> rList) throws Exception{
		InputStream is = ServletActionContext.getServletContext().getResourceAsStream("/reportTemplates/mTemplate.docx"); 
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
				ByteArrayOutputStream os = new ByteArrayOutputStream();
				doc.write(os);
				ByteArrayInputStream bis = new ByteArrayInputStream(os.toByteArray());
				return bis;
		
	}
	
	public static void main(String[] args) throws Exception {
//		ReportGernerator td = new ReportGernerator();
//		td.exportCattleOrForestReport();
//		td.exportPollutionFreeReport();
//		td.exportQualityReport();
		
//		File f = new File("");
//		System.out.println(f.getAbsolutePath());
		
		
		
	}
}
