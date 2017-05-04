package com.greenfox.colors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner{
  @Autowired
  private HelloWorldApplication helloWorldApplication;

  @Autowired
  private MyColor myColor;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(helloWorldApplication.getHelloWorld());
    myColor.printColor();
  }
}
