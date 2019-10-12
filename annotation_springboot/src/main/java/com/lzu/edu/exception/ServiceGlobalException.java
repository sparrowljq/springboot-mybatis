package com.lzu.edu.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = {"com.lzu.edu.service","com.lzu.edu.mapper","com.lzu.edu.controller"})
public class ServiceGlobalException {
	@ExceptionHandler(RuntimeException.class)//指定捕获的异常类型
	@ResponseBody//将异常类型写入到响应中
	public Map<String, Object> errorResult(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("erroCode", "500");
		map.put("errorMsg", "程序执行异常!请联系相关人员进行修复");
		return map;
	}
}
