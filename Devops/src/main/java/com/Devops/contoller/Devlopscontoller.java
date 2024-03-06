package com.Devops.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devlopscontoller {
	@GetMapping("send")
	public String msg()
	{
		return "hello world";
	}

}
