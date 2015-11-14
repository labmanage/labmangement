package com.yx.sz.laboratory.workflow.bean;

import cn.itcast.ssh.utils.Constants;

/**
 * 山东省林业局食用林产品质量安全监测抽样单
 * @author stdt
 *
 */
public class ForestFoodSampleList extends AbstractSampleList {
	private String taskFromAddress;//任务下达单位通讯地址
	private String checkType;//检测类别
	private String checkPlace;//检测场所
	private String name;//样品名称
	private String type;//品种
	private String area;//种植面积
	private String productive;//产量
	private String brand;//样品认证及商标
	private String saleUnit;//销售单位
	private String sampleDate;//采样时间
	private int sampleQuantity;
	private String place;//采样地点
	private String comName;//受检单位名称
	private String contactPeople;//联系人
	private String address;//通信地址
	private String phone;//联系电话
	private String remark;//备注
	public String getTaskFromAddress() {
		return taskFromAddress;
	}
	public void setTaskFromAddress(String taskFromAddress) {
		this.taskFromAddress = taskFromAddress;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	public String getCheckPlace() {
		return checkPlace;
	}
	public void setCheckPlace(String checkPlace) {
		this.checkPlace = checkPlace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getProductive() {
		return productive;
	}
	public void setProductive(String productive) {
		this.productive = productive;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSaleUnit() {
		return saleUnit;
	}
	public void setSaleUnit(String saleUnit) {
		this.saleUnit = saleUnit;
	}
	public String getSampleDate() {
		return sampleDate;
	}
	public void setSampleDate(String sampleDate) {
		this.sampleDate = sampleDate;
	}
	public int getSampleQuantity() {
		return sampleQuantity;
	}
	public void setSampleQuantity(int sampleQuantity) {
		this.sampleQuantity = sampleQuantity;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getContactPeople() {
		return contactPeople;
	}
	public void setContactPeople(String contactPeople) {
		this.contactPeople = contactPeople;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public int getSampleSubType() {
		return Constants.PROCESS_TYPE_FOREST_LIST;
	}
	@Override
	public String getCommonSampleName() {
		return this.name;
	}
	
}
