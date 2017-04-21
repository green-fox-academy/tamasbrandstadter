package com.greenfox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListCommandTest {

  @Test
  void execute() {
    ListCommand listCommand = new ListCommand();
    assertEquals("No todos for today! :)", listCommand.execute());
  }

  @Test
  void getFlag() {
    ListCommand listCommand = new ListCommand();
    assertEquals("-l", listCommand.getArgument());
  }

  @Test
  void getUsage() {
    ListCommand listCommand = new ListCommand();
    assertEquals(" -l   Lists all the tasks", listCommand.getUsage());
  }

}