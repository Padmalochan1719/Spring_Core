package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeAgePrint 
{
	private LocalDate date;
	private LocalTime time;
	private Integer age;
	
	
	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "DateTimeAgePrint [date=" + date + ", time=" + time + ", age=" + age + "]";
	}
	
	
	
	
	
}
