package com.checksuper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ChecksuperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChecksuperApplication.class, args);
	}
	@Bean
	public RestTemplate template()
	{
		return new RestTemplate();
	}

}
