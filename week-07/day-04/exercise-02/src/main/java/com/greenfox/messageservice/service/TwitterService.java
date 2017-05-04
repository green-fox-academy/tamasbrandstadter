package com.greenfox.messageservice.service;

public class TwitterService implements MessageService{

  @Override
  public void sendMessage(String message, String account) {
    System.out.println("Tweet sent to: " + account + " with Message=" + message);
  }
}
