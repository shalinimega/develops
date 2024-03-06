package com.super1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.super1.entitiy.super1;
import com.super1.service.service;

@RestController
public class contoller {
	@Autowired
	service ss;
	@PostMapping("allvalue")
	public String all(@RequestBody List<super1> a)
	{
		return ss.all(a);
	}
	
	@GetMapping("nameprice")
	public List<super1> allprice()
	{
		return ss.allprice();
	}
	
}
