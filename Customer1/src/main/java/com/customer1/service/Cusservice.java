package com.customer1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer1.dao.cusDao;
import com.customer1.entity.Customer1;

@Service
public class Cusservice {
	@Autowired
	cusDao da;
	public String sendfull(List<Customer1> aa)
	{
		return da.sendfull(aa);
	}
	

}
