package com.customer.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.service.Customerservice;

@RestController
public class Customercontoller {
	@Autowired
	Customerservice cs;
	@PostMapping("send")
	public String senddata(@RequestBody List<Customer> aa )
	{
		return cs.senddata(aa);
	}

}
