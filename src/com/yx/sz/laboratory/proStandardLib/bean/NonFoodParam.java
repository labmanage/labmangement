package com.yx.sz.laboratory.proStandardLib.bean;

public class NonFoodParam {
	private int id;
	private int productSeq;
	private String paramSeq;
	private String projectName;
	private String standardCode;
	private String standardName;
	private String limitAndDesc;
	private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}
	
	public String getParamSeq() {
		return paramSeq;
	}
	public void setParamSeq(String paramSeq) {
		this.paramSeq = paramSeq;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStandardName() {
		return standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	public String getStandardCode() {
		return standardCode;
	}
	public void setStandardCode(String standardCode) {
		this.standardCode = standardCode;
	}
	public String getLimitAndDesc() {
		return limitAndDesc;
	}
	public void setLimitAndDesc(String limitAndDesc) {
		this.limitAndDesc = limitAndDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
