package com.greenfoxacademy.lionking;

public class BankAccount {
  private String name;
  private String balance;
  private String animalType;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
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
}





