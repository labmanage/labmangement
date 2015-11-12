package com.yx.sz.laboratory.proStandLibrary.bean;

/**
 * 非食品类参数限值及设备表
 * @author chenghai
 * 2015年6月23日20:09:46
 */
public class NonFoodParametersEquipment {

	private int id;
	
	/**
	 * 序号
	 */
	private String xuhao;

	/**
	 * 产品名称
	 */
	private String chanpinMc;

	/**
	 * 参数名称
	 */
	private String canshuMc;
	
	/**
	 * 参数ID
	 */
	private int canshuId;

	/**
	 * 允许变化范围
	 */
	private String yxbhfw;
	
	/**
	 * 检验依据
	 */
	private String biaozhunDh;
	

	/**
	 * 检验仪器设备名称
	 */
	private String jyyqsbMc;

	/**
	 * 量程
	 */
	private String lc;

	/**
	 * 准确度等级
	 */
	private String zhuqueDj;

	/**
	 * 分辨率
	 */
	private String fbl;

	/**
	 * 
	 */
	private String beiyong;

	/**
	 * 
	 */
	private String bilv;

	/**
	 * 
	 */
	private String bz;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getXuhao() {
		return xuhao;
	}

	public void setXuhao(String xuhao) {
		this.xuhao = xuhao;
	}

	public String getCanshuMc() {
		return canshuMc;
	}

	public void setCanshuMc(String canshuMc) {
		this.canshuMc = canshuMc;
	}


	public String getJyyqsbMc() {
		return jyyqsbMc;
	}

	public void setJyyqsbMc(String jyyqsbMc) {
		this.jyyqsbMc = jyyqsbMc;
	}

	public String getLc() {
		return lc;
	}

	public void setLc(String lc) {
		this.lc = lc;
	}

	public String getZhuqueDj() {
		return zhuqueDj;
	}

	public void setZhuqueDj(String zhuqueDj) {
		this.zhuqueDj = zhuqueDj;
	}

	public String getFbl() {
		return fbl;
	}

	public void setFbl(String fbl) {
		this.fbl = fbl;
	}

	public String getBeiyong() {
		return beiyong;
	}

	public void setBeiyong(String beiyong) {
		this.beiyong = beiyong;
	}

	public String getBilv() {
		return bilv;
	}

	public void setBilv(String bilv) {
		this.bilv = bilv;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getChanpinMc() {
		return chanpinMc;
	}

	public void setChanpinMc(String chanpinMc) {
		this.chanpinMc = chanpinMc;
	}

	public int getCanshuId() {
		return canshuId;
	}

	public void setCanshuId(int canshuId) {
		this.canshuId = canshuId;
	}

	public String getYxbhfw() {
		return yxbhfw;
	}

	public void setYxbhfw(String yxbhfw) {
		this.yxbhfw = yxbhfw;
	}

	public String getBiaozhunDh() {
		return biaozhunDh;
	}

	public void setBiaozhunDh(String biaozhunDh) {
		this.biaozhunDh = biaozhunDh;
	}

}
