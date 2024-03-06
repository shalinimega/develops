package com.customer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Customer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Customer1Application.class, args);
	}
	@Bean
	public RestTemplate template()
	{
		return new RestTemplate();
	}

}
