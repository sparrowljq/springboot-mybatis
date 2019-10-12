package com.lzu.edu.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.lzu.edu.pojo.OrderDetail;

public interface OrderDetailMapper {
	//一对一关联查询
	@Select("select * from orderdetail where id=#{id}")
	@Results({
		@Result(id = true,column = "id",property = "id"),
		@Result(column = "orders_id",property = "orders_id"),
		@Result(column = "items_num",property = "items_num"),
		@Result(property = "items",column = "items_id",one = @One(select = "com.lzu.edu.mapper.ItemsMapper.findItemsById"))
	})
	public OrderDetail selectDetailAndItems(int id);
}
