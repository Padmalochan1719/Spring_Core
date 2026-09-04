package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.DateTimeAgePrint;

public class SetterMethodDependencyTest 
{

	public static void main(String[] args)
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src\\com\\nit\\cnfg\\ApplicationContext.xml");
		Object object = ctx.getBean("dpt");
		DateTimeAgePrint print = (DateTimeAgePrint)object;
		IO.println(print);
		ctx.close();
	}

}
