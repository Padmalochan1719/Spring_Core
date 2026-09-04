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
		System.out.println("Appconfig.timeCreation()");
		return LocalTime.now();
	}
	//here we are getting the Ambiguity issue so that we are using @Qualifier in Spring bean
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
	@Bean(name="ldate1")
	public LocalDate dateCreation1()
	{
		return LocalDate.now();
	}
	
}
