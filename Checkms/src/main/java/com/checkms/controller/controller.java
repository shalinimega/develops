package com.checkms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.checkms.entity.shop;

@RestController
public class controller {
	@Autowired
	RestTemplate rr;

	@GetMapping("find")
	public List<shop> find() {
		String url = "http://localhost:8080/getall";
		String url1 = "http://localhost:8082/findhsn/";
		ResponseEntity<List<shop>> ii = rr.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<shop>>() {
				});
		List<shop> ff = ii.getBody();
		for (shop x : ff) {
//			int a = x.getHsn();
//			ResponseEntity<Integer> b = rr.exchange(url1 + a, HttpMethod.GET, null, Integer.class);
//			int c = b.getBody();
			x.setPrice(x.getPrice() + x.getPrice() * 10 / 100);
		}
		return ff;
	}

}
