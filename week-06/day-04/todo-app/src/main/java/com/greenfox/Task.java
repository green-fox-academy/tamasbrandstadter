package com.greenfox;

class Task {
  private String taskDescription;
  private boolean isItDone;

  Task(String taskDescription) {
    this.taskDescription = taskDescription;
    this.isItDone = false;
  }

  Task(String taskDescription, boolean isItDone) {
    this.taskDescription = taskDescription;
    this.isItDone = isDone();
  }

  boolean isDone() {
    return true;
  }

  String getTaskDescription() {
    return taskDescription;
  }
}

