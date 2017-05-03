package com.greenfoxacademy.lionking;

public class BankAccount {
  String name;
  String balance;
  String animalType;
  boolean isHeBad;

  public BankAccount(String name, String balance, String animalType, boolean isHeBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isHeBad = isHeBad;
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
}





