package com.bdqn.tcmp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.dto.UserDTO;
import com.bdqn.tcmp.entity.User;

public interface UserMapper {
	/**
	 * 代理商表查询全部
	 * 
	 * @return
	 */
	List<User> SelectUserAll();

	/**
	 * 代理商表的一级查询
	 * 
	 * @return
	 */
	List<User> SelectUserOne();

	/**
	 * 代理商表的二级查询/属于一级代理的商户
	 * 
	 * @return
	 */
	List<User> SelectUserTwo();

	/**
	 * 用户登录
	 * 
	 * @param dto
	 * @return
	 */
	User userLogin(UserDTO dto);
	
	/**
	 * 根据等级id进行查询
	 * @param levelID 等级id
	 * @return 
	 */
	List<Map<String, Object>> selectUserByLevelID(
			@Param("levelID") Integer levelID);

	
}
