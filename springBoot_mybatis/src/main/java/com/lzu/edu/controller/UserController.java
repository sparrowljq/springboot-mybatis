package com.lzu.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzu.edu.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/addUser")
	public String addUser(String name,Integer age) {
		userService.insert(name, age);
		return "success";
	}
}
