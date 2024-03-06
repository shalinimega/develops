package com.shop.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.entity.shop;
import com.shop.service.Shopservice;

@RestController
public class ShopController {
	@Autowired
	Shopservice ss;
	@PostMapping("send")
	public String send1(@RequestBody List<shop> aa)
	{
		return ss.send1(aa);
	}
	
	@GetMapping("getid/{a}")
	public shop getid(@PathVariable int a)
	{
		return ss.getid(a);
	}
	
	@PutMapping("putid")
	public String putid(@RequestBody shop s)
	{
		return ss.putid(s);
	}
	@GetMapping("getall")
	public List<shop> getall()
	{
		return ss.getall();
	}
	
	

}
