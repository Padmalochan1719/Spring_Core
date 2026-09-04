package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class Seasonfinder 
{
	private LocalDate date;
	
	@Autowired
	public void setDate(LocalDate date)
	{
		this.date= date;
	}
	
	public String findSeason(String user)
	{
		int monthValue = date.getMonthValue();
		if(monthValue >=3 && monthValue <=6)
		{
			return user+" The current season is : Summer";
		}
		else if(monthValue >=7 && monthValue <=10)
		{
			return user+" The current season is : Rainy";
		}
		else
		{
			return user+" The current season is : Rainy";			
		}
		
	}
	
}
