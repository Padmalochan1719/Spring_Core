package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dtp")
public class CurrentDateTimePrint {
	
	private LocalDate date;
	private LocalTime time;
	
	@Autowired
	public void pushDate(LocalDate date)
	{
		this.date=date;
	}
	@Autowired
	public void pushTime(LocalTime time)
	{
		this.time = time;
	}
	@Override
	public String toString() {
		return "CurrentDateTimePrint [date=" + date + ", time=" + time + "]";
	}
	
	

}
