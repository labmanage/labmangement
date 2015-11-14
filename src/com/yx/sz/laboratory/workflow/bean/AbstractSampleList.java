package com.yx.sz.laboratory.workflow.bean;

public abstract class AbstractSampleList {
	protected long id;
	/**
	 * 抽样单状态 0初始录入,1.开始审批,2为审批完成
	 */
	protected Integer state=0;
	
	/**
	 * 填写抽样单人ID
	 */
	protected String userId;
	
	
	/**
	 * 填写抽样单人姓名
	 */
	
	protected String userName;
	
	/**
	 * 抽样单编号
	 */
	protected String sampleListNum;
	
	
	/**
	 * 任务来源
	 */
	protected String taskFrom;
	/**
	 * 获取实现类的类别
	 * @return
	 */
	public abstract int getSampleSubType();
	/**
	 * 返回抽样单名称
	 * @return
	 */
	public abstract String getCommonSampleName();
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSampleListNum() {
		return sampleListNum;
	}
	public void setSampleListNum(String sampleListNum) {
		this.sampleListNum = sampleListNum;
	}
	public String getTaskFrom() {
		return taskFrom;
	}
	public void setTaskFrom(String taskFrom) {
		this.taskFrom = taskFrom;
	}
}
