package bookzy.com.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


package com.javatpoint.controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@SpringBootApplication
@ComponentScan(basePackages={"bookzy.com.Bookzy"})

@RequestMapping("/")

public class BookzyApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BookzyApplication.class, args);
  SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);
	}
 
 	String home() {
        return "Hello World Spring Boot!";
    }
}

public class HelloWorldController   
{  
@RequestMapping("/")  
public String hello()   
{  
return "Hello javaTpoint";  
}  
}  
