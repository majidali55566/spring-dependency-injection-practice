package com.majid.Dependency.injection.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.majid.Dependency.injection.services.GreetingService;

@Controller
public class MyController {
	private GreetingService greetingService;
	
	public MyController(@Qualifier("anotherPrimaryService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}


}
