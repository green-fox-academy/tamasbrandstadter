package com.greenfox;

import java.util.ArrayList;
import java.util.List;

class TodoList {
  private List<Command> commandList;
  private List<Task> taskList;

  TodoList() {
    this.commandList = new ArrayList<>();
    this.taskList = new ArrayList<>();
    commandList.add(new ListCommand());
    commandList.add(new AddCommand());
    commandList.add(new RemoveCommand());
    commandList.add(new CompleteCommand());

    List<String> rawLines = FileIO.readFromFile();
    for (String lines : rawLines) {
      String[] splitLines = lines.split(";");
      if (splitLines[0].equals("0")) {
        taskList.add(new Task(splitLines[1]));
      } else {
        taskList.add(new Task(splitLines[1], true));
      }
    }
  }

  void printUsage() {
    StringBuilder usage = new StringBuilder("Java Todo application\n" +
        "=====================\n" +
        "Command line arguments:\n");
    for (Command command : commandList) {
      usage.append(command.getDescription()).append("\n");
    }
    System.out.println(usage);
  }

  void run(String args[]) {
    if (args.length == 0) {
      printUsage();
    } else {
      for (Command command : commandList) {
        if (command.getArgument().equals(args[0])) {
          command.execute(taskList, args[1]);
        }
      }
      FileIO.writeTasksToFile(taskList);
    }
  }
}