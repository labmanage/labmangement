package com.yx.sz.laboratory.proStandLibrary.bean;

/**
 * 产品标准库
 * @author chenghai
 * 2015年6月23日20:09:46
 */
public class ProductStandard {

	private int id;
	
	/**
	 * 分类
	 */
	private String fenlei;

	/**
	 * 序号
	 */
	private String xuhao;

	/**
	 * 产品名称
	 */
	private String cpmc;

	/**
	 * 标准代码
	 */
	private String bzdh;

	/**
	 * 标准名称
	 */
	private String bzmc;

	/**
	 * 限制范围及说明
	 */
	private String xzfwsm;

	/**
	 * 备注
	 */
	private String rmark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFenlei() {
		return fenlei;
	}

	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}

	public String getXuhao() {
		return xuhao;
	}

	public void setXuhao(String xuhao) {
		this.xuhao = xuhao;
	}

	public String getCpmc() {
		return cpmc;
	}

	public void setCpmc(String cpmc) {
		this.cpmc = cpmc;
	}

	public String getBzmc() {
		return bzmc;
	}

	public void setBzmc(String bzmc) {
		this.bzmc = bzmc;
	}

	public String getXzfwsm() {
		return xzfwsm;
	}

	public void setXzfwsm(String xzfwsm) {
		this.xzfwsm = xzfwsm;
	}

	public String getRmark() {
		return rmark;
	}

	public void setRmark(String rmark) {
		this.rmark = rmark;
	}

	public String getBzdh() {
		return bzdh;
	}

	public void setBzdh(String bzdh) {
		this.bzdh = bzdh;
	}
	
}
