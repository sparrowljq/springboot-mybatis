package com.lzu.edu.pojo;

import lombok.Data;

@Data
public class OrderDetail {
	private Integer id;
	private Integer orders_id;
	private Items items;
	private Integer items_num;
}
