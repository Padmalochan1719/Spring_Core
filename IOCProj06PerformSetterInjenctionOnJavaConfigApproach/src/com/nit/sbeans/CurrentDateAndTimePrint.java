package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dlp")
public class CurrentDateAndTimePrint {
	
	private LocalDate date;
	private LocalTime time;
	
	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Autowired
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CurrentDateAndTimePrint [date=" + date + ", time=" + time + "]";
	}
	
	
	
	
	
	

}
