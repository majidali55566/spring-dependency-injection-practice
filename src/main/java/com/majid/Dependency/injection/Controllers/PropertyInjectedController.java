package com.majid.Dependency.injection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.majid.Dependency.injection.services.GreetingService;




@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("propertyGreetingService")
	GreetingService greetingSerive;
	 
	 public String getGreeting() {
		 return greetingSerive.sayGreeting();
	 }

}
