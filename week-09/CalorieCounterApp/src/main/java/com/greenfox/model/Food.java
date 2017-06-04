package com.greenfox.model;

import javax.persistence.*;

@Entity
public class Food {
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private Long id;
  private String description;
  private double calories;
  private String mealDate;
  @OneToOne
  @JoinColumn(name = "type")
  private FoodType type;

  public Food(FoodType type, String description, double calories, String mealDate) {
    this.type = type;
    this.description = description;
    this.calories = calories;
    this.mealDate = mealDate;
  }

  public Food (){

  }

  public void setMealDate(String mealDate) {
    this.mealDate = mealDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FoodType getType() {
    return type;
  }

  public void setType(FoodType type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getCalories() {
    return calories;
  }

  public void setCalories(double calories) {
    this.calories = calories;
  }

  public String getMealDate() {
    return mealDate;
  }

  public void String(String mealDate) {
    this.mealDate = mealDate;
  }
}
