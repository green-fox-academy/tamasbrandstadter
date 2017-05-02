package com.greenfox;

public class CreditCardReservationApp {
  public static void main(String[] args) {
    CreditCardReservation creditCardReservation = new CreditCardReservation("ABC01", "1776");
    System.out.println(creditCardReservation.toString());
    creditCardReservation = new CreditCardReservation("ABC02", "8576");
    System.out.println(creditCardReservation.toString());
    creditCardReservation = new CreditCardReservation("ABC03", "1234");
    System.out.println(creditCardReservation.toString());
  }
}
