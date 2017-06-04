package com.greenfox.service;

import com.greenfox.model.FoodType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParameterValidator {
  private List<String> missingFields;

  public ParameterValidator() {
    this.missingFields = new ArrayList<>();
  }

  public List<String> getMissingFields(String calories, String foodType, String mealDate) {
    if (calories.isEmpty()) {
      missingFields.add("calories");
    }
    if (foodType.isEmpty()) {
      missingFields.add("type");
    }
    if (mealDate.isEmpty()) {
      missingFields.add("mealdate");
    }
    return missingFields;
  }

  public String showMissingFields(List<String> missingFields){
    String fields = "Missing field(s): ";
    for (String missing : missingFields) {
      fields += missing + ", ";
    }
    this.missingFields.clear();
    return fields;
  }
}
