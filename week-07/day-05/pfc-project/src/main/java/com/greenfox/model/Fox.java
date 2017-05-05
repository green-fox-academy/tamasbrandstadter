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
  List<String> toLearnTrickList;
  String food;
  String drink;
  String[] foodArray;
  String[] drinkArray;

  public Fox() {
    this.name = "Mr. Green";
    this.drink = "water";
    this.food = "salad";
    this.trickList = new ArrayList<>();
    this.toLearnTrickList = new ArrayList<>();
    toLearnTrickList.add("invisibility");
    toLearnTrickList.add("godmode");
    this.foodArray = new String[]{"meat", "bread"};
    this.drinkArray = new String[]{"beer", "vodka"};
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

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String[] getFoodArray() {
    return foodArray;
  }

  public String[] getDrinkArray() {
    return drinkArray;
  }

  public List<String> getToLearnTrickList() {
    return toLearnTrickList;
  }

  public void addTrick(String trick) {
    trickList.add(trick);
  }

  public void removeTrick(String trick) {
    toLearnTrickList.remove(trick);
  }

  public int getToLearnTrickListSize() {
    return toLearnTrickList.size();
  }
}
