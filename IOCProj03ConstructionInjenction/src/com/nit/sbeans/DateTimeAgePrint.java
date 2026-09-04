package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeAgePrint 
{
	private LocalDate date;
	private LocalTime time;
	private Integer age;	
	public DateTimeAgePrint(LocalDate date, LocalTime time, Integer age) 
	{
		System.out.println("DateTimeAgePrint.DateTimeAgePrint()");
		super();
		this.date = date;
		this.time = time;
		this.age = age;
	}
	@Override
	public String toString() {
		return "DateTimeAgePrint [date=" + date + ", time=" + time + ", age=" + age + "]";
	}
	
	
	
	
	
}
