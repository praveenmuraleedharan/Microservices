package com.learning.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Controller
public class HelloWorldController {

	//GET
	//URI /helloworld
	//method helloworld
	
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	
	@GetMapping(path="/helloworld")
	public String helloWorld()
	{
		return "Hello World";
	}
}
