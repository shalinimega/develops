package com.Hel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Hel.entity.Employee;
import com.Hel.entity.Product;

@RestController
public class Helcontroller {
	@Autowired
	RestTemplate rest;
	@GetMapping("msg")
	public String msg1()
	{
	     String url="http://localhost:8081/hi";
	     ResponseEntity<String> a=rest.exchange(url, HttpMethod.GET, null, String.class);
	     String d=a.getBody();
	     return d;
	}
	@GetMapping("add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b)
	{
		 String url="http://localhost:8081/add/";
		 ResponseEntity<Integer> bb=rest.exchange(url+a+"/"+b, HttpMethod.GET, null, Integer.class);
		 Integer f=bb.getBody();
		 return f;
	}
	
	@PostMapping("obj")
	public Employee getobj(@RequestBody Employee a)
	{
		String url="http://localhost:8081/obj";
		ResponseEntity<Employee> ii=rest.exchange(url, HttpMethod.POST, null,new ParameterizedTypeReference<Employee>() {});
		Employee ff=ii.getBody();
		return ff;
	}
	@GetMapping("ppp/{aa}")
	public Product getp(@PathVariable int aa)
	{
		String url="http://localhost:8080/getprice/price/";
		ResponseEntity<Product> pp=rest.exchange(url+aa,HttpMethod.GET,null,new ParameterizedTypeReference<Product>() {});
		Product gg=pp.getBody();
		return gg;
	}
   
	
	
	

}
