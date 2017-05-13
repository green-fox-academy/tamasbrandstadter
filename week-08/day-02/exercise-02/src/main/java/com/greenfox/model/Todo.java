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

  public Todo() {
  }

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.id = id;
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}