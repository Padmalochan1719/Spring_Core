package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.CurrentDateAndTimePrint;

public class MainTestClass {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		try(ctx)
		{
			CurrentDateAndTimePrint bean = ctx.getBean("dlp",CurrentDateAndTimePrint.class);
			IO.println(bean);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
