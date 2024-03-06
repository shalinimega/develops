package com.WebAppTask.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppTaskcontoller {
	@GetMapping("get")
	public String all()
	{
		return "hi shalini";
	}

}
