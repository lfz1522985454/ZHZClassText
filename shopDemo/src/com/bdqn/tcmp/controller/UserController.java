package com.bdqn.tcmp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.tcmp.dto.UserDTO;
import com.bdqn.tcmp.entity.User;
import com.bdqn.tcmp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@ResponseBody
	@RequestMapping("/selAll.do")
	public Map<String, Object> selectUserAll() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userList", userService.SelectUserAll());
		System.out.println("-------进入查询全部------代理商--------");
		return map;
	}

	

	@ResponseBody
	@RequestMapping("/selOne.do")
	public Map<String, Object> selectUserOne() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userOneList", userService.SelectUserOne());
		System.out.println("-------进入一级查询-----代理商----------");
		return map;
	}

	@ResponseBody
	@RequestMapping("/selTwo.do")
	public Map<String, Object> selectUserTwo() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userTwoList", userService.SelectUserTwo());
		System.out.println("-------进入二级查询------代理商---------");
		return map;
	}

	/**
	 * 用户登录
	 * @param dto
	 * @return 登录对象
	 */
	@RequestMapping("userlogin.do")
	@ResponseBody
	public User userLogin(UserDTO dto) {
		System.out.println("进入登录查询总行");
		System.out.println("用户名:" + dto.getUserName());
		System.out.println("密    码:" + dto.getUserPwd());
		User user = userService.userLogin(dto);
		if (user == null) {
			user = new User();
		}
		return user;
	}
	
	
	@ResponseBody
	@RequestMapping("/selByLevelID.do")
	public List<Map<String, Object>> selByLevelID(Integer levelID) {
		return userService.selectUserByLevelID(levelID);
	}
	
	
}
