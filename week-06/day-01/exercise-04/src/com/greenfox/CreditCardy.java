package com.greenfox;

public interface CreditCardy {
  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(String codeAccount);

  String toString();
}
