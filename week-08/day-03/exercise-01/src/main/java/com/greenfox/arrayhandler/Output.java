package com.greenfox.arrayhandler;

public class Output {
  private int result;

  public Output() {

  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum(int[] inputArray) {
    int temp = 0;
    for (int i = 0; i < inputArray.length; i++) {
      temp += inputArray[i];
    }
    this.result = temp;
  }

  public void multiply(int[] inputArray) {
    int temp = 1;
    for (int i = 0; i < inputArray.length; i++) {
      temp *= inputArray[i];
    }
    this.result = temp;
  }
}
