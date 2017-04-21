package com.greenfox;

public class TodoApp {
  static final String PRINTUSAGE = "Python Todo application\n" +
          "=======================\n+" +
          "Command line arguments:\n" +
          "-l   Lists all the tasks\n" +
          "-a   Adds a new task\n" +
          "-r   Removes an task\n" +
          "-c   Completes an task";

  public String printUsageWithOutArgument(String[] args) {
    return PRINTUSAGE;
  }


  public String printUsage() {
    return PRINTUSAGE;
  }
}
