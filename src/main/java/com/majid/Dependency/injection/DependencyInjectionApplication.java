package com.majid.Dependency.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.majid.Dependency.injection.Controllers.ConstructoInjectedController;
import com.majid.Dependency.injection.Controllers.MyController;
import com.majid.Dependency.injection.Controllers.PropertyInjectedController;
import com.majid.Dependency.injection.Controllers.SetterInjectedController;



@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
	
		ApplicationContext ctx= SpringApplication.run(DependencyInjectionApplication.class, args);
		
		MyController ctr=(MyController) ctx.getBean("myController");
		
		String greeting = ctr.sayHello();
		
		System.out.println(greeting);
		
		System.out.println("-------");
		
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) 
				ctx.getBean("propertyInjectedController");
		
		System.out.println(	propertyInjectedController.getGreeting());
		
		System.out.println("Setter -----");
		
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("Constructor-----");
		
		ConstructoInjectedController constructoInjectedController =(ConstructoInjectedController)
				ctx.getBean("constructoInjectedController");
		
		System.out.println(constructoInjectedController.getGreeting());

	}
	

}
