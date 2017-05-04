package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
  @Autowired
  MessageService messageService;


  public MessageProceeder() {
    this.messageService = messageService;

  }

  public void processMessage(String input, String email) {
    messageService.sendMessage(input, email);
  }


}
