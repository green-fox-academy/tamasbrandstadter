package com.greenfoxacademy.lionking;

public class BankAccount {
  String name;
  String balance;
  String animalType;
  boolean isHeBad;
  int zebraNumbers;

  public BankAccount(String name, String balance, String animalType, boolean isHeBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isHeBad = isHeBad;
    this.zebraNumbers = 0;
  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isHeBad() {
    return isHeBad;
  }

  public int getZebraNumbers() {
    return zebraNumbers;
  }

  public void setZebraNumbers() {
    this.zebraNumbers += 10;
  }
}





