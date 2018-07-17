package com.bdqn.tcmp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.dao.UserMapper;
import com.bdqn.tcmp.dto.UserDTO;
import com.bdqn.tcmp.entity.User;
import com.bdqn.tcmp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	public List<User> SelectUserAll() {
		// TODO Auto-generated method stub
		return this.userMapper.SelectUserAll();
	}

	public List<User> SelectUserOne() {
		// TODO Auto-generated method stub
		return this.userMapper.SelectUserOne();
	}

	public List<User> SelectUserTwo() {
		// TODO Auto-generated method stub
		return this.userMapper.SelectUserTwo();
	}

	public User userLogin(UserDTO dto) {
		System.out.println("进入登录查询Service");
		return this.userMapper.userLogin(dto);
	}

	public List<Map<String, Object>> selectUserByLevelID(Integer levelID) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByLevelID(levelID);
	}

}
