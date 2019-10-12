package com.lzu.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lzu.edu.pojo.User;

public interface UserMapper {
	@Select("select * from user")
	public List<User> queryUser();
}
