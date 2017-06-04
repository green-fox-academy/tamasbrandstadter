package com.greenfox;

import com.greenfox.model.FoodType;
import com.greenfox.repository.FoodTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalorieCounterApplication implements CommandLineRunner {
	private final FoodTypeRepository foodTypeRepository;

  @Autowired
  public CalorieCounterApplication(FoodTypeRepository foodTypeRepository) {
    this.foodTypeRepository = foodTypeRepository;
  }

  public static void main(String[] args) {
		SpringApplication.run(CalorieCounterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		foodTypeRepository.save(new FoodType("Breakfast"));
    foodTypeRepository.save(new FoodType("Elevenses"));
    foodTypeRepository.save(new FoodType("Lunch"));
    foodTypeRepository.save(new FoodType("Snack"));
    foodTypeRepository.save(new FoodType("Dinner"));
    foodTypeRepository.save(new FoodType("Midnight Snack"));
  }
}
