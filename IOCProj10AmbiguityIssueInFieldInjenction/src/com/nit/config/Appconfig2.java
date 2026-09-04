package com.nit.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//here we are solving the ambiguity issue by using @Primary
@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Appconfig2 {

	@Primary
	@Bean(name="ltime")
	public LocalTime timeCreation()
	{
		return LocalTime.now();
	}
	@Bean(name="ltime1")
	public LocalTime timeCreation1()
	{
		return LocalTime.now();
	}
	
	@Bean(name="ldate")
	public LocalDate dateCreation()
	{
		return LocalDate.now();
	}
	
}
