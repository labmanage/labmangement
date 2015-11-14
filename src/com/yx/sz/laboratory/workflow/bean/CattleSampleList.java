package com.yx.sz.laboratory.workflow.bean;

import cn.itcast.ssh.utils.Constants;

/**
 * 畜产品抽样
 * @author stdt
 *
 */
public class CattleSampleList extends AbstractSampleList {
	
	
	private String place; //抽样地点
	private String link; //抽样环节
	private String company;//受检单位名称
	private String address;//详细地址
	private String legalEntity;//法人代表
	private String mobile;//联系电话
	private String sampleType;//抽样类别
	private String foodOrquarantineNo;//食品流通许可证号/动物防疫证号
	private String name;//样品名称
	private String proCompany;//生产单位;
	private String proComAddress;//生产单位地址
	private String quarantineNo;//动物防疫证号
	private String proDate;//生产日期
	private int sampleCount;//抽样数量
	private int sampleBase;//抽样基数
	private String remark;//备注
		
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLegalEntity() {
		return legalEntity;
	}
	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	public String getFoodOrquarantineNo() {
		return foodOrquarantineNo;
	}
	public void setFoodOrquarantineNo(String foodOrquarantineNo) {
		this.foodOrquarantineNo = foodOrquarantineNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProCompany() {
		return proCompany;
	}
	public void setProCompany(String proCompany) {
		this.proCompany = proCompany;
	}
	public String getProComAddress() {
		return proComAddress;
	}
	public void setProComAddress(String proComAddress) {
		this.proComAddress = proComAddress;
	}
	public String getQuarantineNo() {
		return quarantineNo;
	}
	public void setQuarantineNo(String quarantineNo) {
		this.quarantineNo = quarantineNo;
	}
	public String getProDate() {
		return proDate;
	}
	public void setProDate(String proDate) {
		this.proDate = proDate;
	}
	public int getSampleCount() {
		return sampleCount;
	}
	public void setSampleCount(int sampleCount) {
		this.sampleCount = sampleCount;
	}
	public int getSampleBase() {
		return sampleBase;
	}
	public void setSampleBase(int sampleBase) {
		this.sampleBase = sampleBase;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public int getSampleSubType() {
		return Constants.PROCESS_TYPE_CATTLE_SAMPLE_LIST;
	}
	@Override
	public String getCommonSampleName() {
		return this.name ;
	}
	
	
	
}
