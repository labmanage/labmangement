package com.yx.sz.laboratory.proStandLibrary.bean;

/**
 * 非食品类参数表表
 * @author chenghai
 * 2015年6月23日20:09:46
 */
public class NonFoodParameters {

	private int id;
	
	/**
	 * 项目（产品）序号
	 */
	private String xiangmuCpxh;

	/**
	 * 参数序号
	 */
	private String canshuXh;

	/**
	 * 项目参数名称
	 */
	private String xiangmuCsmc;

	/**
	 * 标准代码
	 */
	private String biaozhunDh;

	/**
	 * 标准名称
	 */
	private String biaozhunMc;

	/**
	 * 限制范围及说明
	 */
	private String xzFwsm;

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

	public String getXiangmuCpxh() {
		return xiangmuCpxh;
	}

	public void setXiangmuCpxh(String xiangmuCpxh) {
		this.xiangmuCpxh = xiangmuCpxh;
	}

	public String getCanshuXh() {
		return canshuXh;
	}

	public void setCanshuXh(String canshuXh) {
		this.canshuXh = canshuXh;
	}

	public String getXiangmuCsmc() {
		return xiangmuCsmc;
	}

	public void setXiangmuCsmc(String xiangmuCsmc) {
		this.xiangmuCsmc = xiangmuCsmc;
	}

	public String getBiaozhunDh() {
		return biaozhunDh;
	}

	public void setBiaozhunDh(String biaozhunDh) {
		this.biaozhunDh = biaozhunDh;
	}

	public String getBiaozhunMc() {
		return biaozhunMc;
	}

	public void setBiaozhunMc(String biaozhunMc) {
		this.biaozhunMc = biaozhunMc;
	}

	public String getXzFwsm() {
		return xzFwsm;
	}

	public void setXzFwsm(String xzFwsm) {
		this.xzFwsm = xzFwsm;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}
