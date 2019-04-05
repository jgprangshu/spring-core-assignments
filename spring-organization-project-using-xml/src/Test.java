package com.capgemini.spring.test;
import com.capgemini.spring.component.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Organization org=(Organization)context.getBean("organization");
		System.out.println(org);
	}

		
}