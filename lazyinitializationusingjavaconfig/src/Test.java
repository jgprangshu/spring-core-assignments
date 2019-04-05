package com.capgemini.spring.test;

import com.capgemini.spring.renderer.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.newconfiguration.NewConfiguration;


public class Test{
	
	public static void main(String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(NewConfiguration.class);
		MessageRenderer renderer = context.getBean("renderer",MessageRenderer.class);
		renderer.render();
	}
}