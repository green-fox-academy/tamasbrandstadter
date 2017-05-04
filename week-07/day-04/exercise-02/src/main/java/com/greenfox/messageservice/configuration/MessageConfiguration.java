package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageProceeder;
import com.greenfox.messageservice.service.MessageService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

  @Bean
  public MessageService emailService() {
    return new EmailService();
  }

  @Bean
  @Primary
  public MessageService twitterService() {
    return new TwitterService();
  }
}
