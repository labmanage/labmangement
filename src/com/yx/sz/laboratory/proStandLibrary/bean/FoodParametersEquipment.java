package com.yx.sz.laboratory.proStandLibrary.bean;

/**
 * 食品类参数限值及设备表
 * 
 * @author chenghai 2015年6月23日20:09:46
 */
public class FoodParametersEquipment {

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
	 * 检验仪器设备名称
	 */
	private String jyyqsbmc;
	
	/**
	 * 检验依据
	 */
	private String biaozhunDh;
	
	/**
	 * 分辨率
	 */
	private String fbl;

	/**
	 * 量程
	 */
	private String lc;

	/**
	 * 精确度
	 */
	private String zhuqueDu;

	/**
	 * 按标准能检项目/按标准应检项目
	 */
	private String abznJxm;

	/**
	 * 比率
	 */
	private String bl;

	/**
	 * 备注
	 */
	private String beizhu;

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

	public String getJyyqsbmc() {
		return jyyqsbmc;
	}

	public void setJyyqsbmc(String jyyqsbmc) {
		this.jyyqsbmc = jyyqsbmc;
	}

	public String getFbl() {
		return fbl;
	}

	public void setFbl(String fbl) {
		this.fbl = fbl;
	}

	public String getLc() {
		return lc;
	}

	public void setLc(String lc) {
		this.lc = lc;
	}

	public String getZhuqueDu() {
		return zhuqueDu;
	}

	public void setZhuqueDu(String zhuqueDu) {
		this.zhuqueDu = zhuqueDu;
	}

	public String getAbznJxm() {
		return abznJxm;
	}

	public void setAbznJxm(String abznJxm) {
		this.abznJxm = abznJxm;
	}

	public String getBl() {
		return bl;
	}

	public void setBl(String bl) {
		this.bl = bl;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
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

	public String getBiaozhunDh() {
		return biaozhunDh;
	}

	public void setBiaozhunDh(String biaozhunDh) {
		this.biaozhunDh = biaozhunDh;
	}

}
