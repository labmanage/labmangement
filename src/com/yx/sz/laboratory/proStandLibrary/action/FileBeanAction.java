package com.yx.sz.laboratory.proStandLibrary.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandardLib.bean.FileBean;
import com.yx.sz.laboratory.proStandardLib.service.IFileBeanService;
import com.yx.sz.laboratory.util.SessionContext;

public class FileBeanAction implements ModelDriven<FileBean> {
	FileBean fileBean = new FileBean();
	private IFileBeanService fileService;
	private File file;
	private String fileFileName;
	private String fileContentType;

	public String list() {
		ValueContext.putValueContext("list", fileService.list());
		return "list";
	}

	public String upload() throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try{
			
		String root = ServletActionContext.getServletContext().getRealPath("/upload");
		File f = new File(root);
		if(!f.exists()){
			f.mkdir();
		}
		is = new FileInputStream(file);
		os = new FileOutputStream(new File(root, fileFileName));
		byte[] buffer = new byte[1024];
		int length = 0;
		while(-1 != (length = is.read(buffer, 0, buffer.length))){
			os.write(buffer);
		}
		fileBean.setName(fileFileName);
		fileBean.setPath(root+"/"+fileFileName);
		fileBean.setUploadDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		fileBean.setUploader(SessionContext.get().getName());
		fileBean.setUrl("/upload/"+fileFileName);
		fileService.save(fileBean);
		
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(null != os)
			os.close();
			if(null != is)
			is.close();
		}
		return "toList";
	}

	public String delete() {
		FileBean f = fileService.getById(fileBean.getId());
		File file = new File(f.getPath());
		if(file.exists()){
			file.delete();
		}
		fileService.delete(f);
		return "toList";
	}

	public String toUpload() {
		return "toUpload";
	}


	@Override
	public FileBean getModel() {
		return fileBean;
	}

	public FileBean getFileBean() {
		return fileBean;
	}

	public void setFileBean(FileBean fileBean) {
		this.fileBean = fileBean;
	}

	public IFileBeanService getFileService() {
		return fileService;
	}

	public void setFileService(IFileBeanService fileService) {
		this.fileService = fileService;
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
