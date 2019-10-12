package com.lzu.edu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.lzu.edu.pojo.User;
import com.lzu.edu.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
   
	@RequestMapping("/insertUser")
	public String insertUser(String username, String sex, String address, String brithday) throws ParseException {
		SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
		User user = new User();
		user.setUsername(username);
		user.setSex(sex);
		user.setAddress(address);
		user.setBrithday(spf.parse(brithday));
		userService.insertUser(user);
		return "success";
	}

	@RequestMapping("/queryAllUser")
	public PageInfo<User> queryAllUser(int page, int pageSize,String name) {

		return userService.queryAllUser(page, pageSize,name);
	}
	@RequestMapping("/queryUserById")
	public User queryUserById(int id) {
		return userService.findUserByDynSql(id);
	}
	@RequestMapping("/findUserByInfo")
	public PageInfo<User> findUserByInfo(String username,String sex,int pageNum,int pageSize){
		return userService.findUserByInfo(username,sex, pageNum, pageSize);
	}
	public String login(User user) {
		
		return "";
	}
}
