package com.greenfox.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo() {}

  public Todo(Long id, String title) {
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}
