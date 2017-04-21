package com.greenfox;

import java.util.ArrayList;
import java.util.List;

class TodoApp {
  static final String PRINTUSAGE = "Python Todo application\n" +
          "=======================\n" +
          "Command line arguments:\n" +
          "-l   Lists all the tasks\n" +
          "-a   Adds a new task\n" +
          "-r   Removes an task\n" +
          "-c   Completes an task";

  private List<Commands> commandsList;

  TodoApp() {
    this.commandsList = new ArrayList<>();
    commandsList.add(new ListCommand());
    commandsList.add(new AddCommand());
    commandsList.add(new CompleteCommand());
    commandsList.add(new RemoveCommand());
  }

  String printUsageWithOutArgument(String[] args) {
    return PRINTUSAGE;
  }

  String printUsage() {
    return PRINTUSAGE;
  }

  String listTask(String[] args) {
    if (args.length >= 0) {
      return "No todos for today! :)";
    }
    return printUsage();
  }
}
