package com.greenfox.logentries;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class LogList {
  private Iterable<Log> entries;
  private int entryCount;

  public LogList() {
    this.entries = new ArrayList<>();
    this.entryCount = 0;
  }

  public Iterable<Log> getEntries() {
    return entries;
  }

  public void setEntries(Iterable<Log> entries) {
    this.entries = entries;
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }

  public void setSize(Iterable<Log> entries) {
    int count = 0;
    for (Log log : entries) {
      count++;
    }
    this.entryCount = count;
  }
}
