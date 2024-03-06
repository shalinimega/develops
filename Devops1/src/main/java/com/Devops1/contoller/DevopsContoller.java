package com.Devops1.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsContoller {
	@GetMapping("send")
	public  String msg()
	{
		return "hello world";
	}

}
