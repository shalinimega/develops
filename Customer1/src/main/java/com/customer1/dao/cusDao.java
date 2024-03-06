package com.customer1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer1.Repository.CusRepoasitory;
import com.customer1.entity.Customer1;

@Repository
public class cusDao {
	@Autowired
	CusRepoasitory ii;
	public String sendfull(List<Customer1> aa)
	{
		  ii.saveAll(aa);
		 return "sucessfully";
	}

}
