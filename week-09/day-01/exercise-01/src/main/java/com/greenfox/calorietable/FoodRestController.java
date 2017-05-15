package com.greenfox.calorietable;

import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/add")
  public CalorieTable addToTable(@RequestParam("name") String name, @RequestParam("amount") int amount,
                                 @RequestParam("calorie") double calorie) {
    calorieTable.addToTable(new Food(name, amount, calorie));
    return calorieTable;
  }

  @DeleteMapping("/remove")
  public CalorieTable deleteFromTable(@RequestBody Food food) {
    calorieTable.deleteFromTable(food.getName());
    return calorieTable;
  }
}
