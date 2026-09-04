package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.WishMessageGenerator;

public class DepencencyMenagementTest {

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src\\com\\nit\\context\\ApplicationContext.xml");
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		String user = IO.readln("Enter the user name: ");
		String showWishMessage = generator.showWishMessage(user);
		IO.println(showWishMessage);
		ctx.close();
	}

}
