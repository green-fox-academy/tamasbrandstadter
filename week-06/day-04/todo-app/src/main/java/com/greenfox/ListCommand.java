package com.greenfox;

public class ListCommand extends Commands{

  public ListCommand(String argument) {
    super("-l");
  }

  @Override
  public String execute() {
    return "No todos for today! :)";

  }
}
