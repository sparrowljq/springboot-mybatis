package com.lzu.edu.pojo;

import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class Orders {
	private Integer id;
	private Integer number;
	private Date createtime;
	private String note;
	private List<OrderDetail> orderDetails;
}
