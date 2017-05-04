package com.greenfox.messageservice.service;

public class EmailService implements MessageService {

  @Override
  public void sendMessage(String input, String email) {
    System.out.println("Email sent to: " + email + " with Message=" + input);
  }
}
