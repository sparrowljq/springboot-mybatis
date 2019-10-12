package com.lzu.edu.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个controller<br>
 * 
 * @author LJQ
 *
 */
//springBoot通过注解启动服务器，默认内嵌Tomcat
//@RestController注解表示该类中的所有方法返回json格式、该注解在pringMVC 4.0以后提供的
//自动配置是springBoot的一个特性，可以根据classPath的jar依赖，自动注册bean 
//@EnableAutoConfiguration注解的作用是开启自动配置 只能扫描当前类
//第二种启动方式：
@RestController
public class UserController {
	@RequestMapping("/userIndex")
	public String userIndex() {

		return "userInformation";
	}
	/*
	 * public static void main(String[] args) {
	 * //整个程序入口，启动springBoot项目创建内置Tomcat服务器，使用Tomcat加载springMVC注解启动类
	 * SpringApplication.run(UserController.class, args); }
	 */
}
