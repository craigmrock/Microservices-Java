package com.CSCI257.staffService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class StaffServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffServiceApplication.class, args);
	}
	
	//special object used to create own rest call and make its own call to other microservice
	@Bean //Allows spring to pick this up and it can be autowired in elsewhere
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
