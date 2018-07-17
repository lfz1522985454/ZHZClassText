package com.bdqn.tcmp.dto;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;




import com.alibaba.fastjson.annotation.JSONField;
import com.bdqn.tcmp.util.Page;

public class RankDTO extends Page {
////	按时间查询
//		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//		@JSONField(format = "yyyy-MM-dd")    //解决Json中文乱码
//		private Date rankDate;
//		
		
//		商户的姓名
		private	String  codeName;

		
		
		public String getCodeName() {
			return codeName;
		}
		public void setCodeName(String codeName) {
			this.codeName = codeName;
		}
	
//		public Date getRankDate() {
//			return rankDate;
//		}
//		public void setRankDate(Date rankDate) {
//			this.rankDate = rankDate;
//		}
//	

}
