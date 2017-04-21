package com.greenfox;

public abstract class Commands {
  private String argument;
  private String commandDescription;

  Commands(String argument, String commandDescription) {
    this.argument= argument;
    this.commandDescription = commandDescription;
  }

  public abstract String execute();

  String getArgument() {
    return argument;
  }

  String getUsage() {
    return " " + argument + "   " + commandDescription;
  }
}
