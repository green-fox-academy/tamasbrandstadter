package com.greenfox;

class TodoApp {
  static final String PRINTUSAGE = "Python Todo application\n" +
          "=======================\n+" +
          "Command line arguments:\n" +
          "-l   Lists all the tasks\n" +
          "-a   Adds a new task\n" +
          "-r   Removes an task\n" +
          "-c   Completes an task";

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
