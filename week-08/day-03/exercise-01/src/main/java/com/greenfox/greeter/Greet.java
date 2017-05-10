package com.greenfox.greeter;

import org.springframework.stereotype.Component;

@Component
public class Greet {
  private String welcomeMessage;

  public Greet() {
    this.welcomeMessage = welcomeMessage;
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }
}
