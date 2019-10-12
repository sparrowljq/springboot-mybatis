package com.lzu.edu.pojo;



import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class User {
	private Integer id;
	private String username;
	private Date brithday;
	private String sex;
	private String address;
	private List<Orders> orders;
	
}
