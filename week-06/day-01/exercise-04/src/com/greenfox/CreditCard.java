package com.greenfox;

import java.util.Random;

public class CreditCard implements CreditCardy {
  private Random random = new Random();
  private String ccNumber;
  private String name;
  private int sumCVV;
  private String numbers = "0123456798";
  private String codeAccount;

  CreditCard(String name, String codeAccount) {
    this.name = name;
    this.ccNumber = generateCCNumber();
    this.codeAccount = codeAccount;
    this.sumCVV = cumeSumCVV(getCodeAccount());
  }

  @Override
  public int getSumCVV() {
    return sumCVV;
  }

  @Override
  public String getNameCardholder() {
    return name;
  }

  @Override
  public String getCodeAccount() {
    return codeAccount;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int number = 0;
    for (int i = 0; i < codeAccount.length(); i++) {
      number += Character.getNumericValue(codeAccount.charAt(i));
    }
    return number;
  }

  @Override
  public String toString() {
    return "Name=" + getNameCardholder() + " CC#=" + ccNumber + " CVV=" + getSumCVV() + " (validated)";
  }

  private String generateCCNumber() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 16; i++) {
      s.append(numbers.charAt(random.nextInt(numbers.length())));
    }
    ccNumber = s.toString();
    return ccNumber;
  }
}
