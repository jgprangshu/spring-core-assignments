package com.capgemini.spring.test;

import com.capgemini.spring.renderer.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


public class Test{

	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MessageRenderer renderer =(MessageRenderer)context.getBean("renderer");
		renderer.render();
		System.out.println(renderer.hashCode());
		
		MessageRenderer renderer1 =(MessageRenderer)context.getBean("renderer");
		System.out.println(renderer1.hashCode());
	}

}