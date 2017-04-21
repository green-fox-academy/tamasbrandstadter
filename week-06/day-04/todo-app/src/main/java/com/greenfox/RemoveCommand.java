package com.greenfox;

public class RemoveCommand extends Commands {

  public RemoveCommand() {
    super("-r", "Removes a task");
  }

  @Override
  public String execute() {
    return null;
  }
}
