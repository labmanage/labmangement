package cn.itcast.ssh.web.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 文件下载
 * @author stdt
 *
 */
@SuppressWarnings("serial")
public class DownLoadAction extends ActionSupport {

	private String fileName;
	
	
	
	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public InputStream getDownloadFile() throws Exception {
		this.fileName  = "qyxportal20140709.sql";
		return ServletActionContext.getServletContext().getResourceAsStream("/upload/"+fileName);
	}
	
	public String execute() throws Exception {
		return SUCCESS;
	}
	
}
