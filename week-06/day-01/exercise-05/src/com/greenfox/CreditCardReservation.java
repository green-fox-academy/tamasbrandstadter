package com.greenfox;

import java.util.Random;

public class CreditCardReservation implements Reservationy, CreditCardy {
  private Random random = new Random();
  private StringBuilder s = new StringBuilder();
  private String ccNumber;
  private String name;
  private int sumCVV;
  private String numbers = "0123456798";
  private String codeAccount;
  private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTXYZVW";
  private String code;
  private static final String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private String day;

  CreditCardReservation(String name, String codeAccount) {
    this.ccNumber = generateCCNumber();
    this.name = name;
    this.codeAccount = codeAccount;
    this.code = code;
    this.day = day;
    this.sumCVV = cumeSumCVV(getCodeAccount());
  }

  @Override
  public String getDowBooking() {
    return day = (DAYS[random.nextInt(DAYS.length)]);
  }

  @Override
  public String getCodeBooking() {
    for (int i = 0; i < 8; i++) {
      s.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
    }
    code = s.toString();
    return code;
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

  private String generateCCNumber() {
    for (int i = 0; i < 16; i++) {
      s.append(numbers.charAt(random.nextInt(numbers.length())));
    }
    ccNumber = s.toString();
    return ccNumber;
  }

  @Override
  public String toString() {
    return "Booking# " + getCodeBooking() + " for " + getDowBooking() + " paid by" + " Name=" + getNameCardholder()
            + " CC#=" + ccNumber + " CVV=" + getSumCVV() + " (validated)";
  }
}
