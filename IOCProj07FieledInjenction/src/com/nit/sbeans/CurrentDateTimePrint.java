package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dtp")
public class CurrentDateTimePrint {
	
	@Autowired
	private LocalDate date;
	@Autowired
	private LocalTime time;
	
	@Override
	public String toString() {
		return "CurrentDateTimePrint [date=" + date + ", time=" + time + "]";
	}
	
	

}
