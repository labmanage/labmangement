package com.yx.sz.laboratory.note.bean;

import java.util.Date;

import cn.itcast.ssh.domain.Employee;

public class NoteBean {

	private long id;//主键
	private String title;//标题
	private String content;//内容
	private Employee publisher;//发布人
	private Date createTime;//创建时间
	private int status;//状态0无效，1有效。默认1
	private Date expireTime;//过期时间
	
	private Date startTime;
	private Date endTime;
	private int isExpired;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Employee getPublisher() {
		return publisher;
	}
	public void setPublisher(Employee publisher) {
		this.publisher = publisher;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getIsExpired() {
		return isExpired;
	}
	public void setIsExpired(int isExpired) {
		this.isExpired = isExpired;
	}

	
	
	
}
