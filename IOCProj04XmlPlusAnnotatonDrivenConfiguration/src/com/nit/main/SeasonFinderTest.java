package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Seasonfinder;

public class SeasonFinderTest {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cnfg/ApplicationContext.xml");
		try(ctx)
		{
			Seasonfinder bean = ctx.getBean("sf",Seasonfinder.class);
			String user= IO.readln("Enter the user name: ");
			String season = bean.findSeason(user);
			IO.println(season);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
