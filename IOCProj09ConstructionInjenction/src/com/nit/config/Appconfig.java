package com.nit.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Appconfig {

	@Bean(name="ltime")
	public LocalTime timeCreation()
	{
		return LocalTime.now();
	}
	
	@Bean(name="ldate")
	public LocalDate dateCreation()
	{
		return LocalDate.now();
	}
	
}
