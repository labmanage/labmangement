package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandardLib.bean.FileBean;
import com.yx.sz.laboratory.proStandardLib.service.IFileBeanService;

/**
 * 文件下载
 * @author liudk
 *
 */
public class DownloadAction implements ModelDriven<FileBean>{
	FileBean fileBean = new FileBean();
	private InputStream inputStream ;
	private IFileBeanService fileService;
	private String fileName;

	@Override
	public FileBean getModel() {
		return fileBean;
	}

	public String execute(){
		return "success";
	}
	public FileBean getFileBean() {
		return fileBean;
	}

	public void setFileBean(FileBean fileBean) {
		this.fileBean = fileBean;
	}

	public InputStream getInputStream() {
		FileBean f = fileService.getById(fileBean.getId());
		try {
			fileName = new String(f.getName().getBytes("UTF-8"),"ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputStream =  ServletActionContext.getServletContext().getResourceAsStream(f.getUrl()); 
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public IFileBeanService getFileService() {
		return fileService;
	}

	public void setFileService(IFileBeanService fileService) {
		this.fileService = fileService;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
