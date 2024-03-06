package com.super2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.super2.dao.dao;
import com.super2.entity.super2;

@Service
public class service {
	@Autowired
	dao dd;
	public String send(List<super2> mm)
	{
		return dd.send(mm);
	}

}
