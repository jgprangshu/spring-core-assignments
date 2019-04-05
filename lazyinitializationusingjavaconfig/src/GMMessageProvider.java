package com.capgemini.spring.provider;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Lazy
@Component("provider")
public class GMMessageProvider implements MessageProvider{
	public String getMessage(){
		return "Good Morning!!" ;
	}

}