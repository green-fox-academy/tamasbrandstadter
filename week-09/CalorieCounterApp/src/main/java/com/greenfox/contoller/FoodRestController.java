package com.greenfox.contoller;

import com.greenfox.model.Food;
import com.greenfox.model.FoodList;
import com.greenfox.model.OkResponse;
import com.greenfox.model.Stats;
import com.greenfox.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodRestController {
  private final FoodRepository foodRepository;
  private FoodList foodList;
  private Stats stats;

  @Autowired
  public FoodRestController(FoodRepository foodRepository) {
    this.foodRepository = foodRepository;
    this.foodList = new FoodList();
    this.stats = new Stats();
  }

  @GetMapping("/getmeals")
  public FoodList getList(){
    foodList.setFoodList((List<Food>) foodRepository.findAll());
    return foodList;
  }

  @GetMapping("/getstats")
  public Stats getStats(){
    stats.setTotalCalories((List<Food>) foodRepository.findAll());
    stats.setNumberOfMeals(foodRepository.count());
    return stats;
  }

  @PostMapping("/meal")
  public OkResponse postMeal(@RequestBody Food food){
    foodRepository.save(food);
    return new OkResponse();
  }

  @PutMapping("/meal")
  public OkResponse updateMeal(@RequestBody Food food) {
    Food updatedFood = foodRepository.findOne(food.getId());
    updatedFood.setMealDate(food.getMealDate());
    updatedFood.setCalories(food.getCalories());
    updatedFood.setType(food.getType());
    updatedFood.setDescription(food.getDescription());
    foodRepository.save(updatedFood);
    return new OkResponse();
  }

  @DeleteMapping("/meal")
  public OkResponse deleteMeal(@RequestBody Food food){
    foodRepository.delete(food.getId());
    return new OkResponse();
  }
}
