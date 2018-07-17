package com.bdqn.tcmp.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;


public class Rank implements Serializable {
		private Integer rankId;
		private Double	rankMoney;
		private Integer codeId;
//		商户的姓名
		private	String  codeName;

		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
		@JSONField(format = "yyyy-MM-dd HH:mm:ss")    //解决Json中文乱码
		private Date	rankDate;
		private Double	rate;
			
		public String getCodeName() {
			return codeName;
		}
		public void setCodeName(String codeName) {
			this.codeName = codeName;
		}
		
		public Integer getRankId() {
			return rankId;
		}
		public void setRankId(Integer rankId) {
			this.rankId = rankId;
		}
		public Double getRankMoney() {
			return rankMoney;
		}
		public void setRankMoney(Double rankMoney) {
			this.rankMoney = rankMoney;
		}
		public Integer getCodeId() {
			return codeId;
		}
		public void setCodeId(Integer codeId) {
			this.codeId = codeId;
		}
		public Date getRankDate() {
			return rankDate;
		}
		public void setRankDate(Date rankDate) {
			this.rankDate = rankDate;
		}
		public Double getRate() {
			return rate;
		}
		public void setRate(Double rate) {
			
			this.rate = rate;
		}
		public Rank(Integer rankId, Double rankMoney, Integer codeId,
				String codeName, Date rankDate, Double rate) {
			super();
			this.rankId = rankId;
			this.rankMoney = rankMoney;
			this.codeId = codeId;
			this.codeName = codeName;
			this.rankDate = rankDate;
			this.rate = rate;
		}
		public Rank() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Rank [rankId=" + rankId + ", rankMoney=" + rankMoney
					+ ", codeId=" + codeId + ", codeName=" + codeName
					+ ", rankDate=" + rankDate + ", rate=" + rate + "]";
		}
	
		

}
