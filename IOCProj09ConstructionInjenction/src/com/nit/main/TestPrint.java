package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.Appconfig;
import com.nit.sbeans.CurrentDateTimePrint;

public class TestPrint {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
		try(ctx)
		{
			CurrentDateTimePrint bean = ctx.getBean("dtp",CurrentDateTimePrint.class);
			IO.println(bean);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
