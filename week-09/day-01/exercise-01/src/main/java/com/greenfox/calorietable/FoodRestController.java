package com.greenfox.calorietable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodRestController {
  private CalorieTable calorieTable;

  public FoodRestController() {
    this.calorieTable = new CalorieTable();
  }

  @GetMapping("/drax")
  public CalorieTable listCalorieTable() {
    return calorieTable;
  }
}
