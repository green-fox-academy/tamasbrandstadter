package com.greenfox;

public class CompleteCommand extends Commands {

  public CompleteCommand() {
    super("-c", "Completes a task");
  }

  @Override
  public String execute() {
    return null;
  }
}
