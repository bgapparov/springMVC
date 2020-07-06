package com.bgapparov.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class HelloController {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "<h1>hello<h2>";
	}
	
	@RequestMapping(value = "/proper", method = RequestMethod.GET)
	public String properHello() {
		return "<h1>hello there, how are you?<h2>";
	}
	
	@RequestMapping(value = "/user_entry")
	public String userForm() {
		
		return " <form action=\"/greeting/user_greeting\" method=\"GET\" >" +
		 " First name:<br> " +
		  "<input type=\"text\"  name=\"fname\"><br>" +
		  "Last name:<br> " +
		  "<input type=\"text\"  name=\"lname\"><br><br>" +
		  "<input type=\"submit\" value=\"Submit\">" +
		"</form>";
	}
	
	@RequestMapping(value = "/user_greeting", method = RequestMethod.GET)
	public String printUserGreeting(@RequestParam String fname, @RequestParam String lname) {
		
		
		return "Hello ther: " + fname  + lname;
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable String id) {
		
		return "Id: " + id;
	}
	
}
