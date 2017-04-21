package com.greenfox;

import java.util.ArrayList;
import java.util.List;

public abstract class Commands {
  private String argument;
  private String commandDescription;
  private List<Commands> commandsList;

  Commands(String argument, String commandDescription) {
    this.argument= argument;
    this.commandDescription = commandDescription;
    this.commandsList = new ArrayList<>();
  }

  public abstract String execute();

  String getArgument() {
    return argument;
  }

  String getUsage() {
    return " " + argument + "   " + commandDescription;
  }

}
