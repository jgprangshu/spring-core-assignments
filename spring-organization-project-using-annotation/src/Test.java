package com.capgemini.spring.test;
import com.capgemini.spring.component.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test{
	public static void main(String args[]){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
 		ctx.load("context.xml");
 		ctx.refresh();
		Organization org = (Organization)ctx.getBean("organization");
		System.out.println(org);
	}

		
}