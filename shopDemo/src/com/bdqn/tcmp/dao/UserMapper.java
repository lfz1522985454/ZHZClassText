package com.bdqn.tcmp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.dto.UserDTO;
import com.bdqn.tcmp.entity.User;

public interface UserMapper {
	/**
	 * �����̱��ѯȫ��
	 * 
	 * @return
	 */
	List<User> SelectUserAll();

	/**
	 * �����̱��һ����ѯ
	 * 
	 * @return
	 */
	List<User> SelectUserOne();

	/**
	 * �����̱�Ķ�����ѯ/����һ��������̻�
	 * 
	 * @return
	 */
	List<User> SelectUserTwo();

	/**
	 * �û���¼
	 * 
	 * @param dto
	 * @return
	 */
	User userLogin(UserDTO dto);
	
	/**
	 * ���ݵȼ�id���в�ѯ
	 * @param levelID �ȼ�id
	 * @return 
	 */
	List<Map<String, Object>> selectUserByLevelID(
			@Param("levelID") Integer levelID);

	
}
