package com.lzu.edu.controller;

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

	@RequestMapping("/queryUser")
	public PageInfo<User> queryUser(int page, int pageSize) {
		return userService.findAllUser(page, pageSize);

	}
}
