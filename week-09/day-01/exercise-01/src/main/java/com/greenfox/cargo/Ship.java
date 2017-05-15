package com.greenfox.cargo;

import org.springframework.stereotype.Component;

@Component
public class Ship {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  private double shipStatus;
  private boolean ready;

  public Ship() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipStatus = 0;
    this.ready = false;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public double getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(double shipStatus) {
    this.shipStatus += shipStatus / 12500;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
