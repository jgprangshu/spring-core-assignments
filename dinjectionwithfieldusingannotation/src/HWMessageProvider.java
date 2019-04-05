package com.capgemini.spring.provider;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

@Component("provider")
public class HWMessageProvider implements MessageProvider{
	public String getMessage(){
		return "Hello World!!" ;
	}

}





