package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodType {
  @Id
  private String type;

  public FoodType(String type){
    this.type = type;
  }

  public FoodType(){

  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
