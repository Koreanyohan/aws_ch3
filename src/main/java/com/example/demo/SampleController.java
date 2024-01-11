package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
	@GetMapping("/")
	public String ex1 () {
		return "ex1";   // 배포할때 /ex1이라 적으면 문제생김
	}

}
