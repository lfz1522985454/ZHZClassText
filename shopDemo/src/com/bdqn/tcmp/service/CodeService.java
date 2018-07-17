package com.bdqn.tcmp.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.dto.CodeDTO;
import com.bdqn.tcmp.entity.Code;

public interface CodeService {
	/**
	 * 商户查询 按照级别查询全部
	 * @return
	 */
	List<Map<String,Object>> SelectCodeAll(Integer levelID);
	
	/**
	 * 新增用户
	 * @param code
	 * @return 返回受影响行数
	 */
	int IntegerCode(Code code);
	
	/**
	 * 带条件的分页查询
	 * @param dto
	 * @return
	 */
	List<Code> SelectCodePage(CodeDTO dto);
	/**
	 * 分页返回总行数
	 * @return 受影响行数
	 */
	int selectCount();
	
	
	/**
	 * 删除商户信息
	 * @param id
	 * @return
	 */
	boolean deleteCode(@Param("codeId")Integer codeId);
	
	/**
	 * 根据条件查询
	 * @param dto
	 * @return
	 */
	List<Code> SelectCodeWhere(CodeDTO dto);
	
	/**
	 * 根据主键获取Id
	 * @param codeId
	 * @return
	 */
	Code selectCodeById(@Param("codeId")Integer codeId);
	
	/**
	 * 修改
	 * @param code
	 * @return
	 */
	boolean updateCode(Code code);
}
