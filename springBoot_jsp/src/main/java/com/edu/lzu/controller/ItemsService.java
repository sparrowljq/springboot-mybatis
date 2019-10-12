package com.edu.lzu.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ItemsService {
	@Async//相当于这个方法单独开启线程
	public String addItem() { 
		log.info("2");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("3");
		return "success";
	}
}
