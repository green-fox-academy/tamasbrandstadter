package com.greenfox.colors;

import org.springframework.beans.factory.annotation.Autowired;

class HelloWorldApplication {
  @Autowired
  private HelloWorld helloWorld;

  HelloWorldApplication(HelloWorld helloWorld) {
    this.helloWorld = helloWorld;
    this.helloWorld.setMessage("Hello World");
  }

  String getHelloWorld() {
    return helloWorld.getMessage();
  }
}
