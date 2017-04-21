package com.greenfox;

public abstract class Commands {
  private String argument;


  Commands(String argument) {
    this.argument= argument;

  }

  public abstract String execute();

  public String getArgument() {
    return argument;
  }


}
