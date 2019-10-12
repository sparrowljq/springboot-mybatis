package com.lzu.edu.pojo;

import java.util.Date;

import lombok.Data;
@Data
public class Items {
	private Integer id;
	private String name;
	private float price;
	private String detail;
	private String pic;
	private Date createtime;
}
