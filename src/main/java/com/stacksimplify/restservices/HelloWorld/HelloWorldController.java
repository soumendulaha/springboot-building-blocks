package com.stacksimplify.restservices.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	//@RequestMapping(method = RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworldone")
  public String HelloWorld()
  {
	  return "Hello World soumenu";
  }
	@GetMapping("/helloworldBean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails ("Soumemdu","Laha","101");
	}
}
