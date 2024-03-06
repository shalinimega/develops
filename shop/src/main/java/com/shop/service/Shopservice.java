package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.dao.Shopdao;
import com.shop.entity.shop;

@Service
public class Shopservice {
	@Autowired
	Shopdao sd;
	public String send1(List<shop> aa)
	{
		return sd.send1(aa);
	}
	public shop getid(int a)
	{
		return sd.getid(a);
	}
	public String putid(shop s)
	{
		return sd.putid(s);
	}
	public List<shop> getall()
	{
		return sd.getall();
	}

}
