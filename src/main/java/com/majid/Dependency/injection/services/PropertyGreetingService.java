package com.majid.Dependency.injection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Say Hello Property-greeting-service";
	}

}
