package com.abhishekj.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//GET
	//URI - /hello-world
	//method - "Hello-World"
	@GetMapping(path= "/hello-world")
	public String helloWorld() {
		return "Hello-World-bois";
	}
	
	@GetMapping(path= "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello-World-bean");
	}
	
	//URI - /hello-world/{name}
	@GetMapping(path= "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello-World, %s",name));
	}
}
