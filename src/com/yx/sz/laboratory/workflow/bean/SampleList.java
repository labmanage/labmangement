package com.yx.sz.laboratory.workflow.bean;

public class SampleList {

	private long id = 0;
	
	/**
	 * 抽样单状态 0初始录入,1.开始审批,2为审批完成
	 */
	private Integer state=0;
	
	/**
	 * 填写抽样单人ID
	 */
	private String userId;
	
	
	/**
	 * 填写抽样单人姓名
	 */
	
	private String userName;
	
	/**
	 * 抽样单编号
	 */
	private String sampleListNum;
	
	
	/**
	 * 任务来源
	 */
	private String taskFrom;
	
	/**
	 * 区域类型
	 */
	private String regionType;
	
	/**
	 * 被抽样单位名称
	 */
	private String companyName;
	
	/**
	 * 被抽样单位地址
	 */
	private String companyAddress;
	
	/**
	 * 被抽样单位法人代表
	 */
	private String lawerMan;
	
	/**
	 * 被抽样单位年销售额
	 */
	private String yearSales;
	
	/**
	 * 被抽样单位营业执照号
	 */
	private String businessLicenseNumber;
	
	/**
	 * 被抽样单位联系人
	 */
	private String contactPerson;
	
	/**
	 * 被抽样单位电话
	 */
	private String telnumber;
	
	/**
	 * 被抽样单位传真
	 */
	private String fax;
	
	/**
	 * 被抽样单位邮编
	 */
	private String zipcode;
	
	/**
	 * 抽样地点
	 */
	private String samplePlace;
	
	/**
	 * 样品来源
	 */
	private String sampleSource;
	
	
	/**
	 * 样品属性
	 */
	private String sampleAttribute;
	
	/**
	 * 样品类型
	 */
	private String sampleType;
	
	/**
	 * 样品名称
	 */
	private String sampleName;
	
	/**
	 * 商标
	 */
	private String goodsMark;
	
	/**
	 * 生产、加工、购进日期
	 */
	private String produceDate;
	
	/**
	 * 规格型号
	 */
	private String model;
	
	/**
	 * 样品批号
	 */
	private String sampleNum;
	
	/**
	 * 保质期
	 */
	private String safeLife;
	
	/**
	 * 执行标准、技术文件
	 */
	private String oprativeStandard;
	
	/**
	 * 质量等级
	 */
	private String qualityGrade;
	
	/**
	 * 生产许可证编码
	 */
	private String produceCode;
	
	/**
	 * 单价
	 */
	private String unitPrice;
	
	/**
	 * 是否出口
	 */
	private String isExports;
	
	/**
	 * 抽样基数/批量
	 */
	private String sampleBase;
	
	/**
	 * 抽样数量
	 */
	private String sampleQulity;
	
	/**
	 * 备样数量
	 */
	private String samplePrepareQulity;
	
	/**
	 * 进货量
	 */
	private String inComeQulity;
	
	/**
	 * 库存量
	 */
	private String beHaveQulity;
	
	/**
	 * 样品形态
	 */
	private String sampleShape;
	
	/**
	 * 包装分类
	 */
	private String pakageType;
	
	/**
	 * 生产者名称
	 */
	private String producerName;
	
	/**
	 * 生产者地址
	 */
	private String producerAddress;
	
	/**
	 * 生产者联系人
	 */
	private String producerContacter;
	
	/**
	 * 生产者联系电话
	 */
	private String producerTel;
	
	/**
	 * 抽样时样品的存储状态
	 */
	private String sampleStatus;
	
	/**
	 * 寄送样品截止日期
	 */
	private String sendDeadline;
	
	/**
	 * 寄送样品地址
	 */
	private String sampleSendAddress;
	
	/**
	 * 抽样样品包装
	 */
	private String samplePakage;
	
	/**
	 * 抽样方式
	 */
	private String sampleMethod;
	
	/**
	 * 抽样单位名称
	 */
	private String sampleCompanyName;
	
	/**
	 * 抽样单位地址
	 */
	private String sampleCompanyAddress;
	
	/**
	 * 抽样联系人
	 */
	private String sampleCompanyContacter;
	
	/**
	 * 抽样电话
	 */
	private String sampleCompanyTel;
	
	/**
	 * 抽样单位传真
	 */
	private String sampleCompanyfax;
	
	/**
	 * 抽样单位邮编
	 */
	private String sampleCompanycode;
	
	/**
	 * 备注
	 */
	private String remarks;


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

	public String getRegionType() {
		return regionType;
	}

	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getLawerMan() {
		return lawerMan;
	}

	public void setLawerMan(String lawerMan) {
		this.lawerMan = lawerMan;
	}

	public String getYearSales() {
		return yearSales;
	}

	public void setYearSales(String yearSales) {
		this.yearSales = yearSales;
	}

	public String getBusinessLicenseNumber() {
		return businessLicenseNumber;
	}

	public void setBusinessLicenseNumber(String businessLicenseNumber) {
		this.businessLicenseNumber = businessLicenseNumber;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getSamplePlace() {
		return samplePlace;
	}

	public void setSamplePlace(String samplePlace) {
		this.samplePlace = samplePlace;
	}

	public String getSampleSource() {
		return sampleSource;
	}

	public void setSampleSource(String sampleSource) {
		this.sampleSource = sampleSource;
	}

	public String getSampleAttribute() {
		return sampleAttribute;
	}

	public void setSampleAttribute(String sampleAttribute) {
		this.sampleAttribute = sampleAttribute;
	}

	public String getSampleType() {
		return sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getGoodsMark() {
		return goodsMark;
	}

	public void setGoodsMark(String goodsMark) {
		this.goodsMark = goodsMark;
	}

	public String getProduceDate() {
		return produceDate;
	}

	public void setProduceDate(String produceDate) {
		this.produceDate = produceDate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSampleNum() {
		return sampleNum;
	}

	public void setSampleNum(String sampleNum) {
		this.sampleNum = sampleNum;
	}

	public String getSafeLife() {
		return safeLife;
	}

	public void setSafeLife(String safeLife) {
		this.safeLife = safeLife;
	}

	public String getOprativeStandard() {
		return oprativeStandard;
	}

	public void setOprativeStandard(String oprativeStandard) {
		this.oprativeStandard = oprativeStandard;
	}

	public String getQualityGrade() {
		return qualityGrade;
	}

	public void setQualityGrade(String qualityGrade) {
		this.qualityGrade = qualityGrade;
	}

	public String getProduceCode() {
		return produceCode;
	}

	public void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getIsExports() {
		return isExports;
	}

	public void setIsExports(String isExports) {
		this.isExports = isExports;
	}

	public String getSampleBase() {
		return sampleBase;
	}

	public void setSampleBase(String sampleBase) {
		this.sampleBase = sampleBase;
	}

	public String getSampleQulity() {
		return sampleQulity;
	}

	public void setSampleQulity(String sampleQulity) {
		this.sampleQulity = sampleQulity;
	}

	public String getSamplePrepareQulity() {
		return samplePrepareQulity;
	}

	public void setSamplePrepareQulity(String samplePrepareQulity) {
		this.samplePrepareQulity = samplePrepareQulity;
	}

	public String getInComeQulity() {
		return inComeQulity;
	}

	public void setInComeQulity(String inComeQulity) {
		this.inComeQulity = inComeQulity;
	}

	public String getBeHaveQulity() {
		return beHaveQulity;
	}

	public void setBeHaveQulity(String beHaveQulity) {
		this.beHaveQulity = beHaveQulity;
	}

	public String getSampleShape() {
		return sampleShape;
	}

	public void setSampleShape(String sampleShape) {
		this.sampleShape = sampleShape;
	}

	public String getPakageType() {
		return pakageType;
	}

	public void setPakageType(String pakageType) {
		this.pakageType = pakageType;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getProducerAddress() {
		return producerAddress;
	}

	public void setProducerAddress(String producerAddress) {
		this.producerAddress = producerAddress;
	}

	public String getProducerContacter() {
		return producerContacter;
	}

	public void setProducerContacter(String producerContacter) {
		this.producerContacter = producerContacter;
	}

	public String getProducerTel() {
		return producerTel;
	}

	public void setProducerTel(String producerTel) {
		this.producerTel = producerTel;
	}

	public String getSendDeadline() {
		return sendDeadline;
	}

	public String getSampleStatus() {
		return sampleStatus;
	}

	public void setSampleStatus(String sampleStatus) {
		this.sampleStatus = sampleStatus;
	}

	public void setSendDeadline(String sendDeadline) {
		this.sendDeadline = sendDeadline;
	}

	public String getSampleSendAddress() {
		return sampleSendAddress;
	}

	public void setSampleSendAddress(String sampleSendAddress) {
		this.sampleSendAddress = sampleSendAddress;
	}

	public String getSamplePakage() {
		return samplePakage;
	}

	public void setSamplePakage(String samplePakage) {
		this.samplePakage = samplePakage;
	}

	public String getSampleMethod() {
		return sampleMethod;
	}

	public void setSampleMethod(String sampleMethod) {
		this.sampleMethod = sampleMethod;
	}

	public String getSampleCompanyName() {
		return sampleCompanyName;
	}

	public void setSampleCompanyName(String sampleCompanyName) {
		this.sampleCompanyName = sampleCompanyName;
	}

	public String getSampleCompanyAddress() {
		return sampleCompanyAddress;
	}

	public void setSampleCompanyAddress(String sampleCompanyAddress) {
		this.sampleCompanyAddress = sampleCompanyAddress;
	}

	public String getSampleCompanyContacter() {
		return sampleCompanyContacter;
	}

	public void setSampleCompanyContacter(String sampleCompanyContacter) {
		this.sampleCompanyContacter = sampleCompanyContacter;
	}

	public String getSampleCompanyTel() {
		return sampleCompanyTel;
	}

	public void setSampleCompanyTel(String sampleCompanyTel) {
		this.sampleCompanyTel = sampleCompanyTel;
	}

	public String getSampleCompanyfax() {
		return sampleCompanyfax;
	}

	public void setSampleCompanyfax(String sampleCompanyfax) {
		this.sampleCompanyfax = sampleCompanyfax;
	}

	public String getSampleCompanycode() {
		return sampleCompanycode;
	}

	public void setSampleCompanycode(String sampleCompanycode) {
		this.sampleCompanycode = sampleCompanycode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	
	
	
}
