package com.greenfoxacademy.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringstartApplication.class, args);



	}

	public static String hello() {
	  return "Hello World";
  }

}
