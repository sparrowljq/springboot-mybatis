package com.edu.lzu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "com.edu.lzu.controller")
public class GlobalException {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody//将异常写入到响应中
	public Map<String, Object> errorResult(){
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("errorCode", "500");
		map.put("errorMsg", "错误异常");
		return map;
	}
}
