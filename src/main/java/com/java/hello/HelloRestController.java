package com.java.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping("/springBoot")
	public String index(){
		return "helloworld in Maven";
	}
	
}
