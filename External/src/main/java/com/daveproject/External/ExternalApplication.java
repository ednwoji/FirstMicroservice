package com.daveproject.External;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ExternalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalApplication.class, args);
	}

	@Bean
	@LoadBalanced  //Because the application name was changed, we need to apply the load balance
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}
}
