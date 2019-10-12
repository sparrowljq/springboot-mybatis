package com.lzu.edu.util;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.lzu.edu.pojo.User;

public class UserDynaSqlProvider {
	public String findUserById(Integer id) {
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("user");
		sql.WHERE("id=#{id}");
		return sql.toString();
	}

	public String findUserByInfo(Map<String, Object> map) {
		String name = (String) map.get("name");
		String sex = (String) map.get("sex");
		SQL sql = new SQL();
		sql.SELECT("*");
		sql.FROM("user");
		if (name != null && name != " ") {
			sql.WHERE("username like #{name}");
		}
		if (sex != null && sex != " ") {
			sql.WHERE("sex =#{sex}");
		}
		return sql.toString();
	}

	public String insertUserDynSql(User user) {
		SQL sql = new SQL();
		sql.INSERT_INTO("user ");
		if (user.getUsername() != null) {
			sql.VALUES("username", "#{username}");
		}
		if (user.getBrithday() != null) {
			sql.VALUES("brithday", "#{brithday}");
		}
		if (user.getAddress() != null) {
			sql.VALUES("address", "#{address}");
		}
		if (user.getSex() != null) {
			sql.VALUES("sex", "#{sex}");
		}
		return sql.toString();
	}

	public String updateUserDynSql(User user) {
		SQL sql = new SQL();
		sql.UPDATE("user");
		if (user.getUsername() != null) {
			sql.SET("username=#{username}");
		}
		if (user.getSex() != null) {
			sql.SET("sex=#{sex}");
		}
		if (user.getBrithday() != null) {
			sql.SET("brithday=#{brithday}");
		}
		if (user.getAddress() != null) {
			sql.SET("address=#{address}");
		}
		sql.WHERE("id=#{id}");
		return sql.toString();
	}

	public String deleteUserDynSql(Integer id) {
		SQL sql = new SQL();
		sql.DELETE_FROM("user");
		if (id != null) {
			sql.WHERE("id=#{id}");
		}
		return sql.toString();
	}
}
