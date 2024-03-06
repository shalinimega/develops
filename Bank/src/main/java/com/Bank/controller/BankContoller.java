package com.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.customException.IfscNotfoundException;
import com.Bank.entity.Bank;
import com.Bank.service.Bankservice;

@RestController
public class BankContoller {
	@Autowired
	Bankservice bs;

	@PostMapping("data")
	public String sendall(@RequestBody List<Bank> mm) {
		return bs.sendall(mm);

	}

	@GetMapping("ifscget/{a}")
	public String getall(@PathVariable String a) {
		return bs.getall(a);
	}

	@PostMapping("exception/{a1}")
	public String exc(@PathVariable String a1) throws IfscNotfoundException {
		return bs.exc(a1);
	}
	@GetMapping("findid/{q}")
	public List<Bank> mess(@PathVariable int q)
	{
		return bs.mess(q);
	}
}
