package com.greenfox;

import java.util.List;

public abstract class Command {
  private String description;
  private String argument;

  abstract void execute(List<Task> task, String args);

  Command(String argument, String description) {
    this.description = description;
    this.argument = argument;
  }

  String getArgument() {
    return argument;
  }

  String getDescription() {
    return argument + " " + description;
  }
}
