package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wka")
public class WeakDayAnalyzer 
{
	private LocalDate date;

	public WeakDayAnalyzer() 
	{
		super();
		System.out.println("WeakDayOrNot.WeakDayOrNot()");
	}
	
	@Autowired
	public void setDate(LocalDate date)
	{
		this.date=date;
	}
	
	public String getMessage(String user)
	{
		//get the day Number
		int value = date.getDayOfWeek().getValue();
		
		if(value ==1 || value ==7)
		{
			return user+" the day is Weak End";
		}
		else
		{
			return user+" the day is not a weakEnd";
		}
	}
	
}
