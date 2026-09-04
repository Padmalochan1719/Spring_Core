package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dtp")
public class CurrentDateTimePrint {
	
	private LocalDate date;
	private LocalTime time;
	
	@Autowired//if we don not place AutoWired also IOC Container will call the parameterized constructor
	public CurrentDateTimePrint(LocalDate date,LocalTime time)
	{
		System.out.println("CurrentDateTimePrint.CurrentDateTimePrint()");
		super();
		this.date=date;
		this.time=time;
	}
	
	
	public CurrentDateTimePrint() {
		super();
	}


	@Override
	public String toString() {
		return "CurrentDateTimePrint [date=" + date + ", time=" + time + "]";
	}
	
	

}
