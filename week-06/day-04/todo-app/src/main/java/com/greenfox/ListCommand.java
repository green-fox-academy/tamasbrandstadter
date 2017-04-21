package com.greenfox;

public class ListCommand extends Commands{

  public ListCommand() {
    super("-l", "Lists all the tasks");
  }

  @Override
  public String execute() {
    return "No todos for today! :)";
  }
}
