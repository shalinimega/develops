package com.Anntion1.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Empcontoller {
	@Qualifier("senior")
	@Autowired
	Emp ee;
	@GetMapping("send")
	public String msg()
	{
		return ee.msg();
	}
	

}
