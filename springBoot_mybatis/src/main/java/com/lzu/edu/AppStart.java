package com.lzu.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 在启动文件中添加@MapperScan,那么可以在映射文件上不添加注解。
 * @author LJQ
 *
 */
@SpringBootApplication
@MapperScan(basePackages ={"com.lzu.edu.mapper"})//扫描映射文件 可以在mapper接口上直接添加@mapper注解就不需要扫包
public class AppStart {
	public static void main(String[] args) {
		SpringApplication.run(AppStart.class, args);
	}
	
}
