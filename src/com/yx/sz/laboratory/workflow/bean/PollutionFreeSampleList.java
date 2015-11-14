package com.yx.sz.laboratory.workflow.bean;

import cn.itcast.ssh.utils.Constants;

/**
 * 无公害抽样单
 * @author stdt
 *
 */
public class PollutionFreeSampleList extends AbstractSampleList {
	
	private String name; //产品名称
	private String code;//样品编号
	private String standard;//产品执行标准
	private String spackage;//包装形式
	private String proDate;//产品收获（出厂）日期
	private String saveCondition;//保存要求
	private String comName;//单位名称
	private String comAddress;//通讯地址
	private String comPhone;//单位电话
	private String comPostCode;//邮政编码
	private String comFax;//传真
	private String sampleDate;//抽样日期
	private String place;//抽样地点
	private String method;//抽样方法
	private String part;//抽样部位
	private int quantity;//抽样数量
	private int sampleBase;
	private String bcomName;//被抽检单位名称
	private String bcomPhone;//被抽检单位电话
	private String bcomAddress;//被抽检单位地址
	private String bpostCode;//被抽检单位邮政编码
	private String bcomFax;//被抽检单位传真
	private String receiveUser;//受理/收样人
	private String sendUser;//抽样/送样人
	private String receiveDate;//收养日期
	private String sendDate;//送样日期
	private String sampleSituation;//样品交接时的状况
	private String remark;//备注
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSpackage() {
		return spackage;
	}
	public void setSpackage(String spackage) {
		this.spackage = spackage;
	}
	public String getProDate() {
		return proDate;
	}
	public void setProDate(String proDate) {
		this.proDate = proDate;
	}
	public String getSaveCondition() {
		return saveCondition;
	}
	public void setSaveCondition(String saveCondition) {
		this.saveCondition = saveCondition;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getComAddress() {
		return comAddress;
	}
	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}
	public String getComPhone() {
		return comPhone;
	}
	public void setComPhone(String comPhone) {
		this.comPhone = comPhone;
	}
	public String getComPostCode() {
		return comPostCode;
	}
	public void setComPostCode(String comPostCode) {
		this.comPostCode = comPostCode;
	}
	public String getComFax() {
		return comFax;
	}
	public void setComFax(String comFax) {
		this.comFax = comFax;
	}
	public String getSampleDate() {
		return sampleDate;
	}
	public void setSampleDate(String sampleDate) {
		this.sampleDate = sampleDate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSampleBase() {
		return sampleBase;
	}
	public void setSampleBase(int sampleBase) {
		this.sampleBase = sampleBase;
	}
	
	public String getBcomName() {
		return bcomName;
	}
	public void setBcomName(String bcomName) {
		this.bcomName = bcomName;
	}
	public String getBcomPhone() {
		return bcomPhone;
	}
	public void setBcomPhone(String bcomPhone) {
		this.bcomPhone = bcomPhone;
	}
	public String getBcomAddress() {
		return bcomAddress;
	}
	public void setBcomAddress(String bcomAddress) {
		this.bcomAddress = bcomAddress;
	}
	public String getBpostCode() {
		return bpostCode;
	}
	public void setBpostCode(String bpostCode) {
		this.bpostCode = bpostCode;
	}
	public String getBcomFax() {
		return bcomFax;
	}
	public void setBcomFax(String bcomFax) {
		this.bcomFax = bcomFax;
	}
	public String getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}
	public String getSendUser() {
		return sendUser;
	}
	public void setSendUser(String sendUser) {
		this.sendUser = sendUser;
	}
	public String getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	public String getSampleSituation() {
		return sampleSituation;
	}
	public void setSampleSituation(String sampleSituation) {
		this.sampleSituation = sampleSituation;
	}
	@Override
	public int getSampleSubType() {
		return Constants.PROCESS_TYPE_PF_LIST;
	}
	@Override
	public String getCommonSampleName() {
		return this.name;
	}
	
}
