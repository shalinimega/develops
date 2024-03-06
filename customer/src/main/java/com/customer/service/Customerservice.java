package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.Customerdao;
import com.customer.entity.Customer;

@Service
public class Customerservice {
     @Autowired
     Customerdao cd;
     public String senddata(List<Customer> aa )
 	{
 		return cd.senddata(aa);
 	}
}
