package com.greenfox.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Todo {
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo() {

  }

  public Todo(long id, String title) {
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}
