package com.example.springboot;

import java.util.Arrays;

import javax.annotation.PreDestroy;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	static ApplicationContext ctx = null;
	
	public static void main(String[] args) {
		ctx = SpringApplication.run(Application.class, args);
		

	}
	
}
