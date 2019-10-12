package com.lzu.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.lzu.edu.mapper" })
public class pageHelperApp {
	public static void main(String[] args) {
		SpringApplication.run(pageHelperApp.class, args);
	}
}
