package com.lzu.edu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author LJQ
 *
 */
@Controller
public class PageController {
	@RequestMapping("pageIndex")
	public String pageIndex(Map<String, Object> map) {
		map.put("name", "kobe");
		map.put("age", 20);
		return "page";
	}
}
