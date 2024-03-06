package com.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hello.entity.Employee;

@RestController
public class Hellocontroller {
	@GetMapping("hi")
	public String getmsg()
	{
		return "hello world";
	}
	@GetMapping("add/{a}/{b}")
    public int getadd(@PathVariable int a,@PathVariable int b)
    {
		return a+b;
    }
	@PostMapping("obj")
	public Employee getobj()
	{
		Employee ee=new Employee();
		ee.setId(3);
		ee.setName("shalini");
		ee.setSalary(1000);
		ee.setAdd("chennai");
		return ee;
	}
}
