package com.yx.sz.laboratory.instrumenttation.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.instrumenttation.bean.InstrumentTation;
import com.yx.sz.laboratory.instrumenttation.service.InstrumentTationService;

public class InstrumentTationAction implements ModelDriven<InstrumentTation> {

	InstrumentTation instrumentTation = new InstrumentTation();
	
	private InstrumentTationService instrumentTationService;
	
	List list = new ArrayList();
	
	private File file;
	private String fileFileName;
	private String fileContentType;
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.instrumentTationService.getInstrumentTationByprocDefinitionId();
		ValueContext.putValueContext("list", list);
		return "showList";
	}
	
	/**
	 * 跳转
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public String toInputPage() throws UnsupportedEncodingException{
		return "toInputPage";
	}
	
	/**
	 * 保存数据
	 * @return
	 */
	public String save(){		
		this.instrumentTationService.saveInstrumentTation(instrumentTation);		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		instrumentTation = this.instrumentTationService.getInstrumentTationById(instrumentTation.getId());	
		return "toEditPage";
	}
	public String toImportPage() throws UnsupportedEncodingException{
		return "toImportPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.instrumentTationService.updateInstrumentTation(instrumentTation);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.instrumentTationService.delInstrumentTation(instrumentTation);	
		return "delete";
	}
	
	public String importEquipment() throws IOException{
		String root = ServletActionContext.getServletContext().getRealPath("/upload");
		File f = new File(root);
		if(!f.exists()){
			f.mkdir();
		}
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream(new File(root, fileFileName));
		byte[] buffer = new byte[1024];
		int length = 0;
		while(-1 != (length = is.read(buffer, 0, buffer.length))){
			os.write(buffer);
		}
		XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(new File(root, fileFileName)));
		os.close();
		is.close();
		instrumentTationService.importDataFromXSSFWorkbook(xwb);
		return "toList";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}
	
	public InstrumentTation getInstrumentTation() {
		return instrumentTation;
	}

	public void setInstrumentTation(InstrumentTation instrumentTation) {
		this.instrumentTation = instrumentTation;
	}

	public InstrumentTationService getInstrumentTationService() {
		return instrumentTationService;
	}

	public void setInstrumentTationService(
			InstrumentTationService instrumentTationService) {
		this.instrumentTationService = instrumentTationService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public InstrumentTation getModel() {
		return instrumentTation;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

}
