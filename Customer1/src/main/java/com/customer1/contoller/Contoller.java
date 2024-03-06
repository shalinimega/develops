package com.customer1.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer1.entity.Customer1;
import com.customer1.service.Cusservice;

@RestController
public class Contoller {
	@Autowired
	RestTemplate rt;
	@Autowired
	Cusservice ss;

	@PostMapping("/check")
	public String sendfull(@RequestBody List<Customer1> aa) {
		String url = "http://localhost:8080/ifscget/";
		aa.forEach(x -> {
			String b = x.getIfsc();
			ResponseEntity<String> y = rt.exchange(url + b, HttpMethod.GET, null, String.class);
			String yy = y.getBody();
			x.setBranch(yy);
		});
		return ss.sendfull(aa);
	}

}
