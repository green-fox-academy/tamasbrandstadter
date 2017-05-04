package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
  @Autowired
  private MessageService messageService;

  public void processMessage(String input, String email) {
    messageService.sendMessage(input, email);
  }
}
