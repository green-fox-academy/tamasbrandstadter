package com.greenfox.logentries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Timestamp createdAt;
  private String endPoint;
  private String data;

  public Log() {
  }

  public Log(String endpoint, String data) {
    this.id = id;
    this.endPoint = endpoint;
    this.data = data;
    this.createdAt = new Timestamp(System.currentTimeMillis() / 1000);
  }

  public Long getId() {
    return id;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt() {
    this.createdAt = createdAt;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
