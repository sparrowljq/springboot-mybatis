package com.edu.lzu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	@RequestMapping("/addItems")
	public String addItems() {
		log.info("1");
		String result=itemsService.addItem();
		log.info("4");
		return result;
	}
}
