package com.OnesoftProject.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class OnesoftController {
	@GetMapping("/getStudent")
	public String msg()
	{
		return "this is student";
	}
	@GetMapping("/gettrainer")
	public String msg1()
	{
		return  "this tanier";
	}
	@GetMapping("/getmanger")
	public String msg2()
	{
		return  "this manger";
	}
	

}
