package com.super2.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.super2.entity.super2;
import com.super2.service.service;

@RestController
public class contoller {
	@Autowired
	service ss;
	@PostMapping("send")
	public String send(@RequestBody List<super2> mm)
	{
		return ss.send(mm);
	}
	
}
