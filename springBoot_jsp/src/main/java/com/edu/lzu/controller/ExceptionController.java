package com.edu.lzu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
	@RequestMapping("/exceptionIndex")
	public String exceptionIndex(int i) {
		int j=0;
		j=1/i;
		return "success"+j;
	}
}
