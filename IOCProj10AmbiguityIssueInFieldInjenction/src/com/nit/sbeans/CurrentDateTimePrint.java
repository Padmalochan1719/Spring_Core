package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//here we as getting an ambiguity issue we can solve that issue by using @Qualifier(-) On the top of @AutoWired
@Component("dtp")
public class CurrentDateTimePrint {
	
	//here we are resolve the ambiguity issue by same of spring bean class field name and dependent class bean id
	@Autowired
	private LocalDate ldate;
	
	@Autowired
	@Qualifier("ltime")
	private LocalTime time;
	
	@Override
	public String toString() {
		return "CurrentDateTimePrint [date=" + ldate + ", time=" + time + "]";
	}
	
	

}
