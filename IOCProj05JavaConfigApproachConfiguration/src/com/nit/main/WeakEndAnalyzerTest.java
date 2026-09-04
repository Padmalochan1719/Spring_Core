package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WeakDayAnalyzer;

public class WeakEndAnalyzerTest {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		try(ctx)
		{
			//get bean Object Reference
			WeakDayAnalyzer bean = ctx.getBean("wka",WeakDayAnalyzer.class);
			
			String user = IO.readln("Enter the User: ");
			String message = bean.getMessage(user);
			
			IO.println(message);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
