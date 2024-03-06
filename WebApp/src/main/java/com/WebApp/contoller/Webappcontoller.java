package com.WebApp.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webappcontoller {
	@GetMapping("/msg")
	public String msg()
	{
		return "shalini";	
	}

}
