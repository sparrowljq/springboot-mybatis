package com.edu.lzu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/pageIndex")
	public String pageIndex() {
		return "index";
	}
}
