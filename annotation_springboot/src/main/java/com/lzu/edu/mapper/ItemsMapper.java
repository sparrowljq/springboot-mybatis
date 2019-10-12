package com.lzu.edu.mapper;

import org.apache.ibatis.annotations.Select;

import com.lzu.edu.pojo.Items;

public interface ItemsMapper {
	@Select("select * from items where id=#{id}")
	public Items findItemsById(int id);
}
