package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public EmailService emailService() {
    return new EmailService();
  }

  @Bean
  public TwitterService twitterService() {
    return new TwitterService();
  }
}
