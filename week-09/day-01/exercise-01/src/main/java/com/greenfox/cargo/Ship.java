package com.greenfox.cargo;

import org.springframework.stereotype.Component;

@Component
public class Ship {
  private double caliber25;
  private double caliber30;
  private double caliber50;
  private String shipStatus;
  private boolean ready;

  public Ship() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipStatus = "empty";
    this.ready = false;
  }

  public double getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(double caliber25) {
    this.caliber25 = caliber25;
  }

  public double getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(double caliber30) {
    this.caliber30 = caliber30;
  }

  public double getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(double caliber50) {
    this.caliber50 += caliber50;
  }

  public String getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(String shipStatus) {
    this.shipStatus = shipStatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public void addAmmo(String caliber, double amount) {
    if (caliber.equals(".25")) {
      caliber25 += amount;
    } else if (caliber.equals(".30")) {
      caliber30 += amount;
    } else if (caliber.equals(".50")) {
      caliber50 += amount;
    }
    if (caliber25 + caliber30 + caliber50 == 12500) {
      setShipStatus("full");
    } else if (caliber25 + caliber30 + caliber50 < 12500) {
      double percent = caliber25 + caliber30 + caliber50 / 125;
      shipStatus = String.valueOf((int) percent) + "%";
    } else {
      setShipStatus("overloaded");
    }
    if (shipStatus.equals("full")) {
      setReady(true);
    }
  }
}
