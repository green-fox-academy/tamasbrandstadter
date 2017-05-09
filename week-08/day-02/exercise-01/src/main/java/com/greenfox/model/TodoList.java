package com.greenfox.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoList {
  private List<String> todoList;

  public TodoList() {
    this.todoList = new ArrayList<>();
    todoList.add("Start the day");
    todoList.add("Finish H2 workshop");
    todoList.add("Finish JPA workshop2");
    todoList.add("Create CRUD project");
    todoList.add("Finish exercise");
  }

  public List<String> getTodoList() {
    return todoList;
  }
}
