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
  String[] foodArray;
  String[] drinkArray;

  public Fox() {
    this.trickList = new ArrayList<>();
    this.foodArray = new String[]{"meat", "bread"};
    this.drinkArray = new String[]{"beer", "vodka"};
    trickList.add("invisibility");
    trickList.add("power");
    this.name = "Mr. Green";
    this.drink = "water";
    this.food = "salad";
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

  public void setFood(String food){
    this.food = food;
  }

  public void setDrink(String drink){
    this.drink = drink;
  }

  public String[] getFoodArray() {
    return foodArray;
  }

  public String[] getDrinkArray() {
    return drinkArray;
  }
}
