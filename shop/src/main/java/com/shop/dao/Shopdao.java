package com.shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.entity.shop;
import com.shop.repostiory.ShopRepository;

@Repository
public class Shopdao {
	@Autowired
	ShopRepository sr;
	public String send1(List<shop> aa)
	{
		sr.saveAll(aa);
		return"sucessfully";
	}
	public shop getid(int a)
	{
		return  sr.findById(a).get();
	}
	public String putid(shop s)
	{
		 sr.save(s);
		 return "sucessfully";
		 
	}
	public List<shop> getall()
	{
		return sr.findAll();
	}

}
