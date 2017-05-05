package com.greenfox.controller;

import com.greenfox.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model){
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutritionstore")
  public String nutritionStore(Model model) {
    model.addAttribute("foodList", fox.getFoodArray());
    model.addAttribute("drinkList", fox.getDrinkArray());
    return "nutritionstore";
  }

  @RequestMapping("/changenutrition")
  public String changeNutrition(@RequestParam String food, String drink) {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }
}
