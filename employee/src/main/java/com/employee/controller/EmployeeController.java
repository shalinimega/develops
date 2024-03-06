package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(path="/data")
	public String postdata(@RequestBody Employee a)
	{
		return postdata(a);
	}
	@PatchMapping("/send/{name}")
	public String changedata(@PathVariable String name)
	{
		return es.changedata(name);
	}

}
