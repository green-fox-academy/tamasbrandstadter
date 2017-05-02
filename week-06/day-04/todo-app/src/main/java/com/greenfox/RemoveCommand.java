package com.greenfox;

import java.util.List;

public class RemoveCommand extends Command {

  RemoveCommand() {
    super("-r", "Removes a task");
  }

  @Override
  public void execute(List<Task> task, String args) {
    for (int i = 0; i < task.size(); i++) {
      if (args.equals(task.get(i).getTaskDescription())) {
        task.remove(task.get(i));
      }
    }
  }
}
