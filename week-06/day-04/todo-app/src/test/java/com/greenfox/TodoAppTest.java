package com.greenfox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoAppTest {
  static String expectedOutput = "Python Todo application\n" +
          "=======================\n" +
          "Command line arguments:\n" +
          "-l   Lists all the tasks\n" +
          "-a   Adds a new task\n" +
          "-r   Removes an task\n" +
          "-c   Completes an task";

  @Test
  void printUsage() {
    TodoApp todoApp = new TodoApp();
    String usage = todoApp.printUsage();
    assertEquals(expectedOutput, usage);
  }

  @Test
  void printUsageWithoutArgument() {
    TodoApp todoApp = new TodoApp();
    String[] args = {};
    assertEquals(expectedOutput, todoApp.printUsageWithOutArgument(args));
  }

  @Test
  void printWithLArgument() {
    TodoApp todoApp = new TodoApp();
    String[] args = {"-l"};
    assertEquals("No todos for today! :)", todoApp.listTask(args));
  }




}