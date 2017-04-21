package com.greenfox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoAppTest {
  @Test
  void printUsage() {
    TodoApp todoApp = new TodoApp();
    String usage = todoApp.printUsage();
    String expectedOutput = "Python Todo application\n" +
            "=======================\n+" +
            "Command line arguments:\n" +
            "-l   Lists all the tasks\n" +
            "-a   Adds a new task\n" +
            "-r   Removes an task\n" +
            "-c   Completes an task";
    assertEquals(expectedOutput, todoApp.printUsage());
  }

}