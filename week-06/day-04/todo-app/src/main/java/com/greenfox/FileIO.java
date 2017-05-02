package com.greenfox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FileIO {
  private static final Path PATH = Paths.get("src/data.csv");

  static List<String> readFromFile() {
    List<String> lines;
    try {
      lines = Files.readAllLines(PATH);
    } catch (IOException e) {
      e.printStackTrace();
      lines = new ArrayList<>();
      System.out.println("Couldn't read the file.");
    }
    return lines;
  }

  static void writeTasksToFile(List<Task> tasksToWrite) {
    List<String> listToWrite = new ArrayList<>();
    for (Task task : tasksToWrite) {
      if (task.isDone()) {
        listToWrite.add(task.getTaskDescription() + ";1");
      } else {
        listToWrite.add(task.getTaskDescription() + ";0");
      }
    }
    try {
      Files.write(PATH, listToWrite);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Couldn't write the file.");
    }
  }
}
