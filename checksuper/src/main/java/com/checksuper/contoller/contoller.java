package com.checksuper.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.checksuper.entity.super1;

@RestController
public class contoller {
	@Autowired
	RestTemplate i;
	@GetMapping("savedata")
	public String savedata()
	{
		String a="http://localhost:8080/nameprice";
		ResponseEntity<List<super1>> oo=i.exchange(a,HttpMethod.GET,null,new ParameterizedTypeReference<List<super1>> () {});
		List<super1> m=oo.getBody();
		return "sucess";
				
		
	}

}
