package com.bdqn.tcmp.entity;

import java.io.Serializable;

public class Code implements Serializable {
	private Integer codeId;
	private String codeName;
	private String codePwd;
	private String phone;
	private String address;
	private Integer levelId;
	private Double rate;

	public Integer getCodeId() {
		return codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodePwd() {
		return codePwd;
	}

	public void setCodePwd(String codePwd) {
		this.codePwd = codePwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		System.err.println(rate/100);
		this.rate = rate/100;
	}

	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Code(Integer codeId, String codeName, String codePwd, String phone,
			String address, Integer levelId, Double rate) {
		super();
		this.codeId = codeId;
		this.codeName = codeName;
		this.codePwd = codePwd;
		this.phone = phone;
		this.address = address;
		this.levelId = levelId;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Code [codeId=" + codeId + ", codeName=" + codeName
				+ ", codePwd=" + codePwd + ", phone=" + phone + ", address="
				+ address + ", levelId=" + levelId + ", rate=" + rate + "]";
	}

}
