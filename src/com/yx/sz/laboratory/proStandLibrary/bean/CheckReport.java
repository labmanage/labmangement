package com.yx.sz.laboratory.proStandLibrary.bean;

/**
 * 检验单报告用基础类
 * @author liuhb
 *
 */
public class CheckReport {

	private int id;
	
	/**
	 * 抽样单ID
	 */
	private int sampleListId;
	
	/**
	 * 序号
	 */
	private String xuhao;
	
	/**
	 * 类别/产品名称
	 */
	private String productName;
	
	/**
	 * 参数ID
	 */
	private int canshuId;

	/**
	 * 检验项目/参数名称
	 */
	private String paramName;

	/**
	 * 允许变化范围
	 */
	private String limit;
	
	/**
	 * 标准
	 */
	private String biaozhunDh;
	
	/**
	 * 单位
	 */
	private String unit;
	
	/**
	 * 检验结果
	 */
	private String resultValue;
	
	/**
	 * 单项结论
	 */
	private String singleResult;
	
	/**
	 * 检验依据
	 */
	private String canCheckAndShouldCheck;
	
	/**
	 * taskId
	 * @return
	 */
	private String taskId;
	
	/**
	 * pro_instance_id
	 * @return
	 */
	private String proInstanceId;
	
	/**
	 * executionId
	 * @return
	 */
	private String executionId;
	
	/**
	 * 处理人
	 */
	private String dealMan;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getResultValue() {
		return resultValue;
	}

	public void setResultValue(String resultValue) {
		this.resultValue = resultValue;
	}

	public String getSingleResult() {
		return singleResult;
	}

	public void setSingleResult(String singleResult) {
		this.singleResult = singleResult;
	}

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getCanCheckAndShouldCheck() {
		return canCheckAndShouldCheck;
	}

	public void setCanCheckAndShouldCheck(String canCheckAndShouldCheck) {
		this.canCheckAndShouldCheck = canCheckAndShouldCheck;
	}

	public int getSampleListId() {
		return sampleListId;
	}

	public void setSampleListId(int sampleListId) {
		this.sampleListId = sampleListId;
	}

	public String getXuhao() {
		return xuhao;
	}

	public void setXuhao(String xuhao) {
		this.xuhao = xuhao;
	}

	public int getCanshuId() {
		return canshuId;
	}

	public void setCanshuId(int canshuId) {
		this.canshuId = canshuId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getProInstanceId() {
		return proInstanceId;
	}

	public void setProInstanceId(String proInstanceId) {
		this.proInstanceId = proInstanceId;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getDealMan() {
		return dealMan;
	}

	public void setDealMan(String dealMan) {
		this.dealMan = dealMan;
	}

	public String getBiaozhunDh() {
		return biaozhunDh;
	}

	public void setBiaozhunDh(String biaozhunDh) {
		this.biaozhunDh = biaozhunDh;
	}
	
}
