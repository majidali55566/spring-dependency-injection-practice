package com.majid.Dependency.injection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.majid.Dependency.injection.services.GreetingService;




@Controller
public class ConstructoInjectedController {

	
	private GreetingService greetingSerive;

	@Autowired
	public ConstructoInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingSerive) {
		this.greetingSerive = greetingSerive;
		System.out.println("Object created");
	}
	
	 public String getGreeting() {
		 return greetingSerive.sayGreeting();
	 }
	
	
}
