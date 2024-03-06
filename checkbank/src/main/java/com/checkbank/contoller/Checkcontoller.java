
package com.checkbank.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import com.checkbank.entity.Customer;

@RestControllerAdvice
public class Checkcontoller {
	@Autowired
	RestTemplate rt;
	Service ss;
	@Autowired
	Customer C;
	
	@PostMapping("send1/{a}")
	public String sendfull(@PathVariable String aa)
	{	
	String url="http://localhost:8082/ifscget/";
	ResponseEntity<String> y=rt.exchange(url+aa, HttpMethod.GET,null,String.class);
	String yy=y.getBody();
	C.setBranch(yy);
	return "sucessfull";
	}
	
	

	      
	

}
