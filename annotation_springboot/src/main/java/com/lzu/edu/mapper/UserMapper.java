package com.lzu.edu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.lzu.edu.pojo.User;
import com.lzu.edu.util.UserDynaSqlProvider;

import lombok.extern.log4j.Log4j;

public interface UserMapper {
	//返回受影响的行数
	@Insert("insert into user values(null,#{username},#{brithday},#{sex},#{address})")
	public int insertUser(User user);
	//返回自增主键
	@Insert("insert into user values(null,#{username},#{brithday},#{sex},#{address})")
	@Options(useGeneratedKeys = true,keyProperty = "id")
	public int insertUserReturnKey(User user);
	
	//修改语句
	@Update("update user set username=#{username},brithday=#{brithday},sex=#{sex},address=#{address} where id=#{id}")
	public int updateUser(User user);
	
	//删除语句
	@Delete("delete from user where id=#{id}")
	public int deleteUser(int id);
	
	/*
	 * "<script>"+"SELECT c.*,u.`rolename` FROM s_cust c,s_user u WHERE
	 * c.`cust_link_user`=u.`uid`"
	 * +"<if test='custName!=null'> and c.cust_name like CONCAT('%',#{custName},'%')</if>"
	 * +"<if test='custType!=null'> and c.cust_type like CONCAT('%',#{custType},'%')</if>"
	 * +"</script>"
	 */
	
	
	//查询语句
	@Select("select * from user where username like #{name}")
	
	public List<User> queryAllUser(String name);
	
	
	
	//动态sql开发
	@SelectProvider(type=UserDynaSqlProvider.class,method = "findUserById")
	@Results({
		@Result(id = true,column = "id",property = "id"),
		@Result(column = "username",property = "username"),
		@Result(column = "brithday",property = "brithday"),
		@Result(column = "sex",property = "sex"),
		@Result(column = "address",property = "address"),
		//column是指当前表的关联查询列
		@Result(column = "id",property = "orders",many = @Many(select = "com.lzu.edu.mapper.OrdersMapper.findOrdersByUid"))
	})
	public User queryUserById(Integer id);
	
	
	@SelectProvider(type =UserDynaSqlProvider.class,method = "findUserByInfo" )
	@Results({
		@Result(id = true,column = "id",property = "id"),
		@Result(column = "username",property = "username"),
		@Result(column = "brithday",property = "brithday"),
		@Result(column = "sex",property = "sex"),
		@Result(column = "address",property = "address"),
		@Result(column = "id",property = "orders",many = @Many(select = "com.lzu.edu.mapper.OrdersMapper.findOrdersByUid"))
	})
	public List<User> queryUsersByInfo(Map<String, Object> map);
	
	
	
	//通过动态sql插入
	@InsertProvider(type =UserDynaSqlProvider.class ,method = "insertUserDynSql")
	public int insertUserByDynSql(User user);
	//动态sql修改
	@UpdateProvider(type =UserDynaSqlProvider.class,method = "updateUserDynSql" )
	public int updateUserByDynSql(User user);
	//动态sql删除
	@DeleteProvider(type =UserDynaSqlProvider.class ,method="deleteUserDynSql")
	public int deleteUserByDynSql(int id);
}
