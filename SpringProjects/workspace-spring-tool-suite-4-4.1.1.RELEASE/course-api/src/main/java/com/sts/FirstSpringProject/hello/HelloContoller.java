package com.sts.FirstSpringProject.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hi bannu!!";
	}
	
}


/*
  @RestController -- when a class is being annotated with this, when some service request comes it maps to paticular blcok
  
  @RequestMapping("/hello")
  when an http request come with url /hello, it executes the method code under this nnotation
  it maps only to the GET method by default. To map other HTTP methods, you will have to specify it in the annotation.
   */