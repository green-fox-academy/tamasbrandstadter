package com.greenfox.model;

import java.util.List;

public class Stats {
  private double totalCalories;
  private long numberOfMeals;

  public Stats(){

  }

  public double getTotalCalories() {
    return totalCalories;
  }

  public double setTotalCalories(List<Food> foodList) {
    double totalCalories = 0;
    for (Food food : foodList) {
      totalCalories += food.getCalories();
    }
    this.totalCalories = totalCalories;
    return totalCalories;
  }

  public long getNumberOfMeals() {
    return numberOfMeals;
  }

  public void setNumberOfMeals(long numberOfMeals) {
    this.numberOfMeals = numberOfMeals;
  }
}
