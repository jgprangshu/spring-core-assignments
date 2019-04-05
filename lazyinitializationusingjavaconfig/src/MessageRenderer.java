package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Lazy
@Service("renderer")
public class MessageRenderer{
	private MessageProvider provider;
	private MessageProvider provider1;
	
	@Autowired
	public MessageRenderer(MessageProvider provider){
		this.provider = provider;
	}

	@Autowired
	public void setMessageRenderer(MessageProvider provider1){
		this.provider1 = provider;
	}
	
	public void render(){
		System.out.println(provider.getMessage());
		System.out.println(provider.hashCode());
		System.out.println(provider.hashCode());
	}
}