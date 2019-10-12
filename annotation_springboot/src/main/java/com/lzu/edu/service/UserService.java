package com.lzu.edu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzu.edu.mapper.UserMapper;
import com.lzu.edu.pojo.User;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@Transactional
	public int insertUser(User user) {
		log.info("插入用户：" + user);
		return userMapper.insertUser(user);
	}

	@Transactional
	public int updateUser(User user) {
		log.info("修改用户：" + user);
		return userMapper.updateUser(user);
	}

	@Transactional
	public int deleteUser(int id) {
		log.info("删除用户：");
		return userMapper.deleteUser(id);
	}

	public PageInfo<User> queryAllUser(int page, int pageSize,String name) {
		log.info("查询用户");
		PageHelper.startPage(page, pageSize);
		List<User> userList = userMapper.queryAllUser("%"+name+"%");
		return new PageInfo<>(userList);

	}

	// 动态sql查询
	public User findUserByDynSql(int id) {
		log.info("动态sql语句，通过id查询用户");
		return userMapper.queryUserById(id);
	}

	// 模糊查询用户
	public PageInfo<User> findUserByInfo(String username,String sex, int pageNum, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "%"+username+"%");
		map.put("sex", sex);
		log.info("通过姓名或sex模糊查询用户");
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<User> pageInfo = new PageInfo<>(userMapper.queryUsersByInfo(map));
		return pageInfo;
	}
}
