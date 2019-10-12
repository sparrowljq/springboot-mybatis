package com.lzu.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzu.edu.mapper.UserMapper;

/**
 * 用户服务类
 * 
 * @author LJQ
 *
 */
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public int insert(String name, Integer age) {
		return userMapper.insert(name, age);
	}
}
