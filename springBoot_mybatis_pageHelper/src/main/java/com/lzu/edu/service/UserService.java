package com.lzu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzu.edu.mapper.UserMapper;
import com.lzu.edu.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public PageInfo<User> findAllUser(int page, int pageSize) {
		PageHelper.startPage(page, pageSize);//pageHelper插件底层根据修改sql语句来实现
		List<User> listUser = userMapper.queryUser();
		PageInfo<User> pageInfo = new PageInfo<User>(listUser);
		return pageInfo;
	}
}
