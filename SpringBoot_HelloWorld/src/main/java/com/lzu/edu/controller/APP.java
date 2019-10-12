package com.lzu.edu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 抽取出来的启动类
 * 
 * @author LJQ
 *
 */
/*
 * @EnableAutoConfiguration //默认扫描同包级别开启自动注册
 * 
 * @ComponentScan("com.lzu.edu.controller")//如果包多，则比较麻烦
 */
@SpringBootApplication//相当于以上两个注解的组合
public class APP {
	public static void main(String[] args) {
		// 整个程序入口，启动springBoot项目创建内置Tomcat服务器，使用Tomcat加载springMVC注解启动类
		SpringApplication.run(APP.class, args);
	}
}
