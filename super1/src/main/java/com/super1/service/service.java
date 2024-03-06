package com.super1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.super1.dao.dao;
import com.super1.entitiy.super1;
@Service
public class service {
	@Autowired
	dao ds;
	
	public String all(List<super1> a)
	{
		return ds.all(a);
	}
	public List<super1> allprice()
	{
		return ds.allprice();
	}

}
