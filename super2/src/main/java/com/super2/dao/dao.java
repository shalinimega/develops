package com.super2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.super2.entity.super2;
import com.super2.repository.repository;

@Repository
public class dao {
	@Autowired
	repository rr;
	public String send(List<super2> mm)
	{
		rr.saveAll(mm);
		return "sucess";
	}

}
