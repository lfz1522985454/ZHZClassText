package com.bdqn.tcmp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.CodeDTO;
import com.bdqn.tcmp.entity.Code;
import com.bdqn.tcmp.entity.Rank;
import com.bdqn.tcmp.service.CodeService;

@Controller
@RequestMapping("/code")
public class CodeController {

	@Resource
	private CodeService codeService;

	@ResponseBody
	@RequestMapping("/selAll.do")
	public List<Map<String,Object>> selectCodeAll(Integer levelID) {

		return codeService.SelectCodeAll(levelID);
	}
	
	
	 /**
	  *	按照条件查询
	 * @param dto
	 * @return
	 */
	@ResponseBody
	    @RequestMapping("/where.do")
	    public List<Code> selectBlogByWhere(CodeDTO dto){
	        return codeService.SelectCodeWhere(dto);
	    }

	@ResponseBody
	@RequestMapping("/add.do")
	public int insertCode(Code code) {
//		增加商户信息
		return codeService.IntegerCode(code);
	}
	
	@RequestMapping("/selCodePage.do")
	@ResponseBody
	public Map<String, Object> selectCodePage(CodeDTO dto) {
		System.out.println("进入分页查询");
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(this.codeService.selectCount());
		map.put("page", dto);
		map.put("codePageList", this.codeService.SelectCodePage(dto));
		System.out.println(map.get("codePageList"));
		System.out.println(JSON.toJSONString(map));
		return map;
	}
	

	@RequestMapping("/deleteCode.do")
	@ResponseBody
	public boolean deleteCodeID(Integer codeId) {
		System.out.println(codeId);
		boolean isNo = this.codeService.deleteCode(codeId);
		System.out.println("============返回结果：=============" + isNo);
		return isNo;
	}

	
	/**
	 * 修改用，获取主键ID
	 * @param rankId
	 * @return
	 */
	@RequestMapping("/selCodeById.do")
	@ResponseBody
	public Code selectCodeById(Integer codeId) {
		System.out.println("=======================获取到主键的Id："+codeId+"==================================");
		System.out.println(JSON.toJSONString(this.codeService.selectCodeById(codeId)));
		return this.codeService.selectCodeById(codeId);
	}

	
	/**
	 * 修改Controller
	 * @param code
	 * @return
	 */
	@RequestMapping("/updateCode.do")
	@ResponseBody
	public boolean updateCode(Code code) {
		System.out.println("======返回结果："+code.toString());
		return this.codeService.updateCode(code);
	}

}
