package com.sts.FirstSpringProjectDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//creates a servlet container and deploy this class
public class CourseAPIApp {
	
	public static void main(String[] bannu)
	{
		SpringApplication.run(CourseAPIApp.class, bannu);
		//what it does?
		//static SpringApplication class has static run method
	
	}
}

//SpringApplication.run(CourseAPIApp.class, bannu);
//what it does?
//static SpringApplication class has static run method


//Controller
//spring mvc is the child project of whole spring umbrella	
// what it does? It maps the server side code to urls which gives response



/*
 * @SpringBootApplication 
 // setsup default config
//starts spring app context
//performs class path scan
//starts tomcat server
 * 
 */