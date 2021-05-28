package com.dell.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dell.entity.Person;

@RestController
public class FetchEmail {
	
	@GetMapping("getAll")
	public String fetchEmail()
	{
		RestTemplate restTemplate = new RestTemplate();
		Person quote = restTemplate.getForObject("https://reqres.in/api/users/1", Person.class);
		System.out.println(quote.toString());
		return null;
	}

}
