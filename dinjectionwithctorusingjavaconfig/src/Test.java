package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.newconfiguration.*;

public class Test{
	
	public static void main(String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(NewConfiguration.class);
		MessageRenderer renderer = context.getBean("renderer",MessageRenderer.class);
		renderer.render();
	}
}