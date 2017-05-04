package com.greenfox.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class Fox {
  String name;
  List<String> trickList;
  String food;
  String drink;

  public Fox() {
    this.trickList = new ArrayList<>();
    trickList.add("invisibility");
    trickList.add("power");
    this.name = "Mr. Green";
    this.drink = "salad";
    this.food = "water";
  }

  public int getTrickListSize() {
    return trickList.size();
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public List<String> getTrickList() {
    return trickList;
  }
}
