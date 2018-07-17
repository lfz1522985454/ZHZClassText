package com.bdqn.tcmp.converter;

import org.springframework.core.convert.converter.Converter;

public class StringToUTF8Converter implements Converter<String, String> {

	private String pattern = null;
	
	
	public String getPattern() {
		return pattern;
	}


	public void setPattern(String pattern) {
		this.pattern = pattern;
	}


	public String convert(String source) {
		// TODO Auto-generated method stub
		String text= null;
		try {
			text= new String(source.getBytes("ISO-8859-1"),"UTF-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}

	
}
