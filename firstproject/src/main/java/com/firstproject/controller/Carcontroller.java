package com.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.custom.BrandnotFound;
import com.firstproject.custom.Priceless;
import com.firstproject.entity.Car;
import com.firstproject.services.Carservices;

@RestController
public class Carcontroller {
	@Autowired
	Carservices cs;
	//save
	@PostMapping(value="/savedata")
	public String setData(@RequestBody Car c)throws Priceless
	{
		return cs.setData(c);
	}
	
	
	//save all
	@PostMapping(value="/savedataall")
	public String setall(@RequestBody List<Car> aa)
	{
		return cs.setall(aa);
	}
	
	
	//find by id
	@GetMapping(value="/findid/{w}")
	public Car finddata(@PathVariable int w)
	{
		return cs.finddata(w);
	}
	
	
	// find all
	@GetMapping(value="/findal")
	public List<Car> findal()
	{
		return cs.findal();
	}
	
	
	//deleteby id
	@DeleteMapping(value="/del/{q}")
	public String del(@PathVariable int q)
	{
		return cs.del(q);
	}
	
	
	//mutipleupdate
	@PutMapping(value="/update")
	public String update(@RequestBody Car w)
	{
		return cs.update(w);
	}
	
	//filter
	@GetMapping(value="/getbrand/{brand}")
	public List<Car> getbrand(@PathVariable String brand)throws BrandnotFound
	{
		return cs.getbrand(brand);
	}
	
	@GetMapping(value="/getallda/{price}/{color}")
	public List<Car> getalda(@PathVariable int price,@PathVariable String color)
	{
		return cs.getalda(price,color);
	}
	
	
	//sorted
	@GetMapping(value="/sorts")
	public List<Car> sorts()
	{
		return cs.sorts();
	}
	
	//max
	@GetMapping(value="/maxp")
	public Car maxp()
	{
		return cs.maxs();
	}
	//range
	@PostMapping(value="/priceup/{pp}")
	public List<Car> priceupdate(@PathVariable int pp)
	{
		return cs.priceupdate(pp);
	}
	
	@GetMapping(value="/colorobject/{oo}")
	public List<Car> colorblack(@PathVariable String oo)
	{
		return cs.colorblack(oo);
	}
	//odd
	@GetMapping(value="/odd")
	public List<Car> odds()
	{
		return cs.odds();
	}
	
	}
	


