package com.greenfox.calorietable;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
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

  @PutMapping("/change")
  public CalorieTable updateAmount(@RequestParam("foodname") String name, @RequestParam("amount") int amount) {
    calorieTable.findFood(name).setAmount(amount);
    return calorieTable;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage showError(MissingServletRequestParameterException ex) {
    String parameterName = ex.getParameterName();
    return new ErrorMessage(parameterName + " is a missing parameter.");
  }
}
