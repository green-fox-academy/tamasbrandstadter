package com.greenfox.tamas.reddit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  private String userName;

  public User() {

  }

  public User(String userName){
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
