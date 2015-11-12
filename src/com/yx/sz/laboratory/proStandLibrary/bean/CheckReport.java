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
	private String chanpinMc;
	
	/**
	 * 参数ID
	 */
	private int canshuId;

	/**
	 * 检验项目/参数名称
	 */
	private String canshuMc;

	/**
	 * 允许变化范围
	 */
	private String yxbhfw;
	
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
	private String checkbase;
	
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

	public String getChanpinMc() {
		return chanpinMc;
	}

	public void setChanpinMc(String chanpinMc) {
		this.chanpinMc = chanpinMc;
	}

	public String getCanshuMc() {
		return canshuMc;
	}

	public void setCanshuMc(String canshuMc) {
		this.canshuMc = canshuMc;
	}

	public String getYxbhfw() {
		return yxbhfw;
	}

	public void setYxbhfw(String yxbhfw) {
		this.yxbhfw = yxbhfw;
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

	public String getCheckbase() {
		return checkbase;
	}

	public void setCheckbase(String checkbase) {
		this.checkbase = checkbase;
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
