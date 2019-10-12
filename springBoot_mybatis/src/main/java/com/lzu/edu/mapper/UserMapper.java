package com.lzu.edu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	// 查询语句
	@Select("select * from user where name like'%${name}%'")
	public UserMapper findUserByName(@Param("name") String name);

	// 添加
	@Insert("insert into user(name,age) values(#{name},#{age})")
	public int insert(@Param("name") String name, @Param("age") Integer age);
}
