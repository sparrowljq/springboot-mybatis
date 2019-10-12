package com.lzu.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.lzu.edu.pojo.Orders;

public interface OrdersMapper {
	//一对多查寻
	@Select("select * from orders where id=#{id}")
	@Results({
		@Result(id = true,column = "id",property = "id"),
		@Result(column = "number",property = "number"),
		@Result(column = "createtime",property = "createtime"),
		@Result(column = "note",property = "note"),
		@Result(column = "orders_id",property = "orderDetails",many = @Many(select = "com.lzu.edu.mapper.OrderDetailMapper.selectDetailAndItems"))
		
	})
	public Orders findOrderById(int id);
	//通过用户uid查询订单
	@Select("select * from orders where user_id=#{uid}")
	@Results({
		@Result(id = true,column = "id",property = "id"),
		@Result(column = "number",property = "number"),
		@Result(column = "createtime",property = "createtime"),
		@Result(column = "note",property = "note"),
		@Result(column = "orders_id",property = "orderDetails",many = @Many(select = "com.lzu.edu.mapper.OrderDetailMapper.selectDetailAndItems"))
		
	})
	public List<Orders> findOrdersByUid(int uid);
}
