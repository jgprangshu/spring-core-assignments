package com.capgemini.spring.newconfiguration;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.*;

@Configuration
public class NewConfiguration {
	@Bean
 	public MessageProvider provider() {
 		return new HWMessageProvider();
 	}

	@Bean
	public MessageRenderer renderer(){
 		return new MessageRenderer(provider());
	}

}
 