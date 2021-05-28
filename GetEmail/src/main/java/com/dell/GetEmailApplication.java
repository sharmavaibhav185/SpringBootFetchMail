package com.dell;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.dell.entity.Entity;

@SpringBootApplication
public class GetEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetEmailApplication.class, args);
	}
	

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			
			RestTemplate restTemplete = new RestTemplate();
			Entity user = restTemplete.getForObject("https://reqres.in/api/users/10", Entity.class);
			System.out.println("fetching for https://reqres.in/api/users/1" );
			System.out.println(user.getData().getEmail());
		};
	}

}
