package com.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;

@Repository
public class Customerdao {
	@Autowired
	CustomerRepository rs;
	public String senddata(List<Customer> aa )
 	{
 		 rs.saveAll(aa);
 		 return "sucessfully";
 	}

}
