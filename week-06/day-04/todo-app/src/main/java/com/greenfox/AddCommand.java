package com.greenfox;

public class AddCommand extends Commands {

  public AddCommand() {
    super("-a", "Adds a new task");
  }

  @Override
  public String execute() {
    return null;
  }
}
