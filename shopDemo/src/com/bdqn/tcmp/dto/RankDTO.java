package com.bdqn.tcmp.dto;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;




import com.alibaba.fastjson.annotation.JSONField;
import com.bdqn.tcmp.util.Page;

public class RankDTO extends Page {
////	��ʱ���ѯ
//		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//		@JSONField(format = "yyyy-MM-dd")    //���Json��������
//		private Date rankDate;
//		
		
//		�̻�������
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
