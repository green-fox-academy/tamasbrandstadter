package com.greenfox.model;

import java.util.ArrayList;
import java.util.List;

public class FoodList {
  private List<Food> foodList;

  public FoodList() {
    this.foodList = new ArrayList<>();
  }

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }
}
