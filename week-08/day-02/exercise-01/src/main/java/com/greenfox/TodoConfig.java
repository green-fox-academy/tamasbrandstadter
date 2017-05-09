package com.greenfox;

import com.greenfox.model.TodoList;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {

  public TodoList createTodoList(){
    return new TodoList();
  }
}
