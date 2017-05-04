package com.greenfox.messageservice.service;

public class TwitterService implements MessageService{

  @Override
  public void sendMessage(String from, String to) {
    System.out.println("Email sent to: " + from + " with Message= " + to);
  }
}
