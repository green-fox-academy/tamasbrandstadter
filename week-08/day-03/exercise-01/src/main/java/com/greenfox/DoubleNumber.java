package com.greenfox;

import org.springframework.stereotype.Component;

@Component
public class DoubleNumber {
  private int received;
  private int result;

  public DoubleNumber() {
    this.received = received;
    this.result = result;
  }

  public int getRecieved() {
    return received;
  }

  public int getResult() {
    return result;
  }

  void setReceived(int received) {
    this.received = received;
  }

  void setResult(int result) {
    this.result = result;
  }
}
