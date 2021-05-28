package com.dell.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class AllData {
	
	private Integer id;
	private String email;
	private String firstName;
	private String LastName;
	private String avtar;


}
