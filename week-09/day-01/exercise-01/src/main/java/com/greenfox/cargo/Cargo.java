package com.greenfox.cargo;

public class Cargo {
  private String received;
  private double amount;
  private double shipStatus;
  private boolean ready;

  public Cargo(String received, int amount) {
    this.received = received;
    this.amount = amount;
    this.ready = false;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(double shipStatus) {
    this.shipStatus = shipStatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
