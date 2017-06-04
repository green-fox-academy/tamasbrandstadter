package com.greenfox.contoller;

import com.greenfox.model.Food;
import com.greenfox.model.FoodType;
import com.greenfox.model.Stats;
import com.greenfox.repository.FoodRepository;
import com.greenfox.repository.FoodTypeRepository;
import com.greenfox.service.ParameterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FoodController {
  private final FoodRepository foodRepository;
  private final FoodTypeRepository foodTypeRepository;
  private final ParameterValidator parameterValidator;
  private Stats stats;
  private String errorText;

  @Autowired
  public FoodController(FoodRepository foodRepository, FoodTypeRepository foodTypeRepository,
                        ParameterValidator parameterValidator) {
    this.foodRepository = foodRepository;
    this.foodTypeRepository = foodTypeRepository;
    this.parameterValidator = parameterValidator;
    this.stats = new Stats();
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("foodList", foodRepository.findAll());
    model.addAttribute("size", foodRepository.count());
    model.addAttribute("totalCalories", stats.setTotalCalories((List<Food>) foodRepository.findAll()));
    return "index";
  }

  @GetMapping("/add")
  public String add(Model model) {
    model.addAttribute("options", foodTypeRepository.findAll());
    model.addAttribute("error", errorText);
    return "add";
  }

  @PostMapping("/add/create")
  public String create(@RequestParam(value = "description", required = false, defaultValue = "") String description,
                       @RequestParam("type") String type, @RequestParam(value = "mealDate") String mealDate,
                       @RequestParam("calories") String calories) {
    List<String> missingFields = parameterValidator.getMissingFields(calories, type, mealDate);
    if (missingFields.size() > 0) {
      errorText = parameterValidator.showMissingFields(missingFields);
      return "redirect:/add";
    } else {
      errorText = "";
      Food food = new Food(new FoodType(type), description, Double.valueOf(calories), mealDate);
      foodRepository.save(food);
      return "redirect:/";
    }
  }

  @GetMapping("/{id}/edit")
  public String edit(Model model, @PathVariable("id") long id) {
    model.addAttribute("options", foodTypeRepository.findAll());
    model.addAttribute("food", foodRepository.findOne(id));
    return "add";
  }

  @PostMapping("/{id}/edit/execute")
  public String executeEdit(@PathVariable("id") long id,
                            @RequestParam(value = "description", required = false, defaultValue = "") String description,
                            @RequestParam("type") String type, @RequestParam("calories") String calories,
                            @RequestParam("mealDate") String mealDate) {
    List<String> missingFields = parameterValidator.getMissingFields(calories, type, mealDate);
    if (missingFields.size() > 0) {
      errorText = parameterValidator.showMissingFields(missingFields);
      return "redirect:/add";
    } else {
      errorText = "";
      Food updatedFood = foodRepository.findOne(id);
      updatedFood.setDescription(description);
      updatedFood.setType(foodTypeRepository.findOne(type));
      updatedFood.setCalories(Double.valueOf(calories));
      updatedFood.setMealDate(mealDate);
      foodRepository.save(updatedFood);
      return "redirect:/";
    }
  }

  @RequestMapping(value = "/{id}/delete")
  public String delete(@PathVariable("id") long id) {
    foodRepository.delete(id);
    return "redirect:/";
  }
}
