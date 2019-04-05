package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;


@Service("renderer")
public class MessageRenderer{
	private MessageProvider provider;
	
	@Autowired
	public MessageRenderer(MessageProvider provider){
		this.provider = provider;
	}
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}