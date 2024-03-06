package com.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.custmo.Hsnnotfound;
import com.Product.custmo.Priceless;
import com.Product.entity.Product;
import com.Product.service.Productservice;

@RestController
public class ProductController {
	@Autowired
	Productservice ps;
	@PostMapping(value="/send")
	public String send(@RequestBody Product aa)
	{
		return ps.send(aa);
	}
	@PostMapping(value="/sendall")
	public String sendall(@RequestBody List<Product> aa)
	{
		return ps.sendall(aa);
	}
	@GetMapping(value="/getname/{name}")
	public List<Product> getname(@PathVariable String name)
	{
		return ps.getname(name);
	}
	
	@GetMapping(value="/getprice/{price}")
	public List<Product> getprice(@PathVariable int  price)throws Priceless
	{
		return ps.getprice(price);
	}
	@GetMapping(value="/getrange/{a}/{b}")
	public List<Product> getrange(@PathVariable int a,@PathVariable int b)
	{
		return ps.getrange(a,b);
	}

	@GetMapping(value="/getexp")
	public int getexp()
	{
		return ps.getexp();
	}
	@GetMapping(value="/getmax")
	public Product getmax()
	{
		return ps.getmax();
	}
	
	@GetMapping(value="/getavg")
	public int getavg()
	{
		return ps.getavg();
	}
	
	@GetMapping(value="/getsum")
	public int getsum()
	{
		return ps.getsum();
	}
	@GetMapping(value="/getasc")
	public List<Product> getasc()
	{
		return ps.getasc();
	}
	@GetMapping(value="/getdsc")
	public List<Product> getdsc()
	{
		return ps.getdsc();
	}
	//jquery
	/*@GetMapping("getpp/{a}")
	public List<Product> getpp(@PathVariable int a)
	{
		return ps.getpp(a);
	}*/
	
	@GetMapping("idhsn/{a}")
	public int gethsn(@PathVariable int a)throws Hsnnotfound
	{
		return ps.gethsn(a);
	}
	
	@GetMapping(value="/getpr/{p}")
	public List<Product> getpr(@PathVariable int p)throws Priceless
	{
	     return ps.getpr(p);	
	}
	/*@GetMapping(value="/getname/{nn}")
	public Product gname(@PathVariable String nn)
	{
		return ps.gname(nn);
	}*/
	/*@GetMapping(value="/bet/{a}/{b}")
	public List<Product> betw(@PathVariable int a,@PathVariable int b)
	{
		return ps.betw(a,b);
	}*/
	
	
	
	}


