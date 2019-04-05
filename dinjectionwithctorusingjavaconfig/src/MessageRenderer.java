package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.newconfiguration.*;

public class MessageRenderer{
	private MessageProvider provider;
	
	
	public MessageRenderer(MessageProvider provider){
		this.provider = provider;
	}
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}