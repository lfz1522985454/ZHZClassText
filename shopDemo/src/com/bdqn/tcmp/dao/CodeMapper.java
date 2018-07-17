package com.bdqn.tcmp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.dto.CodeDTO;
import com.bdqn.tcmp.entity.Code;

public interface CodeMapper {

	/**
	 * 商户查询 按照级别查询全部
	 * @return
	 */
	List<Map<String,Object>> SelectCodeAll(@Param("levelID")Integer levelID);
	
	
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
	 * 返回总行数
	 * @return
	 */
	int selectCount();
	
	/**
	 * 删除商户信息
	 * @param id
	 * @return
	 */
	int deleteCode(@Param("codeId")Integer codeId);
	
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
	int updateCode(Code code);
}
 