package com.greenfox.greeter;

import org.springframework.stereotype.Component;

@Component
public class Greet {
  private String welcome_message;

  public Greet() {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
