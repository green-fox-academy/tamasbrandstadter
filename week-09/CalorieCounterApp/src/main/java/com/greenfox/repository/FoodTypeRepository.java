package com.greenfox.repository;

import com.greenfox.model.FoodType;
import org.springframework.data.repository.CrudRepository;

public interface FoodTypeRepository extends CrudRepository<FoodType, String> {
}
