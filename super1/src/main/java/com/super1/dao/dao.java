package com.super1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.super1.entitiy.super1;
import com.super1.repository.repository;

@Repository
public class dao {
	@Autowired
	repository rs;
	public String all(List<super1> a)
	{
		 rs.saveAll(a);
		 return "sucessfully";
	}
	public List<super1> allprice()
	{
		return rs.findAll();
	}

}
