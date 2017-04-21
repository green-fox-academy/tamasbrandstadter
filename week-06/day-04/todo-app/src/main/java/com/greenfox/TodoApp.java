package com.greenfox;

public class TodoApp {

  public String printUsage() {
    return "Python Todo application\n" +
            "=======================\n+" +
            "Command line arguments:\n" +
            "-l   Lists all the tasks\n" +
            "-a   Adds a new task\n" +
            "-r   Removes an task\n" +
            "-c   Completes an task";
  }
}
