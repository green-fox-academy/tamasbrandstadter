package com.greenfox;

import java.util.List;

public class CompleteCommand extends Command {

  CompleteCommand() {
    super("-c", "Completes an task");
  }

  @Override
  public void execute(List<Task> task, String args) {
    for (int i = 0; i < task.size(); i++) {
      if (args.equals(task.get(i).getTaskDescription())) {
        task.get(i).isDone();
      }
    }
  }
}
