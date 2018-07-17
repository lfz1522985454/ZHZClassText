package com.bdqn.tcmp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.dao.CodeMapper;
import com.bdqn.tcmp.dto.CodeDTO;
import com.bdqn.tcmp.entity.Code;
import com.bdqn.tcmp.service.CodeService;

@Service("codeService")
public class CodeServiceImpl implements CodeService {

	@Resource
	private CodeMapper codeMapper;

	public List<Map<String, Object>> SelectCodeAll(Integer levelID) {
		// TODO Auto-generated method stub
		return this.codeMapper.SelectCodeAll(levelID);
	}

	public int IntegerCode(Code code) {
		// TODO Auto-generated method stub
		return this.codeMapper.IntegerCode(code);
	}

	public List<Code> SelectCodePage(CodeDTO dto) {
		// TODO Auto-generated method stub
		return this.codeMapper.SelectCodePage(dto);
	}

	public int selectCount() {
		// TODO Auto-generated method stub
		return this.codeMapper.selectCount();
	}

	public List<Code> SelectCodeWhere(CodeDTO dto) {
		// TODO Auto-generated method stub
		return this.codeMapper.SelectCodeWhere(dto);
	}

	public boolean deleteCode(Integer codeId) {
		// TODO Auto-generated method stub
		return this.codeMapper.deleteCode(codeId) > 0 ? true : false;
	}

	public Code selectCodeById(Integer codeId) {
		// 获取主键ID
		return this.codeMapper.selectCodeById(codeId);
	}

	public boolean updateCode(Code code) {
		// 修改
		return this.codeMapper.updateCode(code)>0?true:false;
	}

}
