package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/")
	public String index() {
		log.info("this is INFO message");
		log.debug("this is DEBUG message");
		log.error("this is ERROR message");
		log.warn("this is WARNING message");
		
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/login")
	public String login() {
		log.info("LOGIN");

		
		return "LOGIN";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		log.info("LOGOUT");

		
		return "LOGOUT";
	}	
}
