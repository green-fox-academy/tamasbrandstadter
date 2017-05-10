package com.greenfox.dountil;

public class DoUntil {
  private int result;

  public DoUntil() {

  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum(int number) {
    int temp = 0;
    for (int i = 1; i <= number; i++) {
      temp += i;
    }
    this.result = temp;
  }

  public void factor(int number) {
    int temp = 1;
    for (int i = 1; i <= number; i++) {
      temp = temp * i;
    }
    this.result = temp;
  }
}
