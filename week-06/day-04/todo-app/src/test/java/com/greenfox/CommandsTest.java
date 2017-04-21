package com.greenfox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandObject extends Commands {

  CommandObject() {
    super("s");
  }

  @Override
  public String execute() {
    return "";
  }
}


class CommandsTest {

  @Test
  void getArgument() {
    CommandObject commandObject = new CommandObject();
    assertEquals("s", commandObject.getArgument());
  }

}