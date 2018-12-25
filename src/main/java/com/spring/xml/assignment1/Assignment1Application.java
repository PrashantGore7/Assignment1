package com.spring.xml.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment1Application{

	

	
	public static void main(String[] args) {
		ApplicationContext appcontext=SpringApplication.run(Assignment1Application.class, args);
		
		for(String names:appcontext.getBeanDefinitionNames())
		{
			System.out.println(names);
		}
	}
	
		
}
