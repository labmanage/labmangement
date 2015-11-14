package com.yx.sz.laboratory.workflow.bean;

import cn.itcast.ssh.utils.Constants;

/**
 * 山东商业职业技术学院食品检测中心
 *质量检测抽样单
 * @author stdt
 *
 */
public class QualitySampleList extends AbstractSampleList{
	
	private String name; //样品名称
	private String brand;//商标
	private String sampleCode;//样品编码
	private int sampleQuantity;//抽样数量
	private String place;//抽样地点
	private String proDate;//生产日期
	private String sampleBase;//抽样基数
	private String sampleDate;//抽样日期
	private String feature;//样品特性
	private String saveCondition;//保存条件
	private String sampleType;//抽样方式
	private String samplePlace;//抽样场所
	private String samplePackage;//样品包装
	private String closure;//封签标志
	private String checkProject;//检验项目
	private String standard;//执行标准
	private String company;//企业名称
	private String address;//通讯地址
	private String mobile;//联系电话
	private String postCode;//邮政编码
	private String companyType;//企业性质
	private String companyRange;//企业规模
	private String proAddress;//产品产地
	private String supplyNameAndContact;//供货商名称及联系方式
	private String quarantineCode;//产品合格证或检疫证号
	private String proSignCode;//产品认证证书编号
	private String permitTransCode;//准运证号
	private String remark;//备注
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSampleCode() {
		return sampleCode;
	}
	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
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
	public String getProDate() {
		return proDate;
	}
	public void setProDate(String proDate) {
		this.proDate = proDate;
	}
	public String getSampleBase() {
		return sampleBase;
	}
	public void setSampleBase(String sampleBase) {
		this.sampleBase = sampleBase;
	}
	public String getSampleDate() {
		return sampleDate;
	}
	public void setSampleDate(String sampleDate) {
		this.sampleDate = sampleDate;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getSaveCondition() {
		return saveCondition;
	}
	public void setSaveCondition(String saveCondition) {
		this.saveCondition = saveCondition;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	public String getSamplePlace() {
		return samplePlace;
	}
	public void setSamplePlace(String samplePlace) {
		this.samplePlace = samplePlace;
	}
	public String getSamplePackage() {
		return samplePackage;
	}
	public void setSamplePackage(String samplePackage) {
		this.samplePackage = samplePackage;
	}
	public String getClosure() {
		return closure;
	}
	public void setClosure(String closure) {
		this.closure = closure;
	}
	public String getCheckProject() {
		return checkProject;
	}
	public void setCheckProject(String checkProject) {
		this.checkProject = checkProject;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyRange() {
		return companyRange;
	}
	public void setCompanyRange(String companyRange) {
		this.companyRange = companyRange;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getSupplyNameAndContact() {
		return supplyNameAndContact;
	}
	public void setSupplyNameAndContact(String supplyNameAndContact) {
		this.supplyNameAndContact = supplyNameAndContact;
	}
	public String getQuarantineCode() {
		return quarantineCode;
	}
	public void setQuarantineCode(String quarantineCode) {
		this.quarantineCode = quarantineCode;
	}
	public String getProSignCode() {
		return proSignCode;
	}
	public void setProSignCode(String proSignCode) {
		this.proSignCode = proSignCode;
	}
	public String getPermitTransCode() {
		return permitTransCode;
	}
	public void setPermitTransCode(String permitTransCode) {
		this.permitTransCode = permitTransCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public int getSampleSubType() {
		return Constants.PROCESS_TYPE_QUALITY_LIST;
	}
	@Override
	public String getCommonSampleName() {
		return this.name;
	}
	
	
	
}
