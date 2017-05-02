package com.greenfox;

import java.util.List;

class ListCommand extends Command {

  ListCommand() {
    super("-l", "Lists all the tasks");
  }

  @Override
  public void execute(List<Task> task, String args) {
    String tasks = "";
    for (int i = 0; i < task.size(); i++) {
      if (task.size() == 0) {
        System.out.println("No todos for today.");
      } else {
        tasks += i + 1 + "-";
        if (task.get(i).isDone()) {
          tasks += "[X]";
        } else {
          tasks += "[ ]";
        }
        tasks += task.get(i).getTaskDescription() + "\n";
      }
      System.out.println(tasks);
    }
  }
}
