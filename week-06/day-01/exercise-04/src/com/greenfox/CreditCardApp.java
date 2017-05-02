package com.greenfox;

public class CreditCardApp {
  public static void main(String[] args) {
    CreditCard creditCard = new CreditCard("ABC0", "8881");
    CreditCard creditCard2 = new CreditCard("ABC1", "5555");
    System.out.println(creditCard.toString());
    System.out.println(creditCard2.toString());
  }
}
