package com.greenfox;

import java.util.List;

public class AddCommand extends Command {

  AddCommand() {
    super("-a", "Adds a new task");
  }

  @Override
  public void execute(List<Task> task, String args) {
    task.add(new Task(args));
  }
}
