package com.greenfox;

import com.greenfox.model.TodoList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {

  @Bean
  public TodoList createTodoList(){
    return new TodoList();
  }
}
