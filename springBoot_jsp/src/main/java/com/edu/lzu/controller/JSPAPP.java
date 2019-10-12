package com.edu.lzu.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync//开启异步调用 扫描包中异步注解
public class JSPAPP {
	public static void main(String[] args) {
		SpringApplication.run(JSPAPP.class, args);
	}
}
