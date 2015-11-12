package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yx.sz.laboratory.proStandLibrary.service.IProjectAndAbilityFileParseService;

@SuppressWarnings("serial")
public class ProjectAndAbilityAction extends ActionSupport{
	private String userName;
	private File file;
	private String fileFileName;
	private String fileContentType;
	
	private IProjectAndAbilityFileParseService projectAndAbilityFileService;
	
	
	public String toUpload(){
		return "toUpload";
	}
	
	@Override
	public String execute() throws Exception{
		String root = ServletActionContext.getServletContext().getRealPath("/upload");
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream(new File(root, fileFileName));
		byte[] buffer = new byte[1024];
		int length = 0;
		while(-1 != (length = is.read(buffer, 0, buffer.length))){
			os.write(buffer);
		}
		XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(new File(root, fileFileName)));
		projectAndAbilityFileService.readSaveAll(xwb);
		os.close();
		is.close();
		
		return SUCCESS;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public IProjectAndAbilityFileParseService getProjectAndAbilityFileService() {
		return projectAndAbilityFileService;
	}

	public void setProjectAndAbilityFileService(
			IProjectAndAbilityFileParseService projectAndAbilityFileService) {
		this.projectAndAbilityFileService = projectAndAbilityFileService;
	}
	

}
