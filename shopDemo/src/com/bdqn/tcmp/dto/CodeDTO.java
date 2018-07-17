package com.bdqn.tcmp.dto;

import com.bdqn.tcmp.util.Page;

public class CodeDTO extends Page {
			
	private Integer levelId;
	

	private String codeName;

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}


	
}
