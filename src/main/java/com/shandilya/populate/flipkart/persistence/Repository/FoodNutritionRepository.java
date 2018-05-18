package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.foodnutrition.models.FoodNutritionProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 5/18/2018
 *         Time: 8:06 PM
 */
public interface FoodNutritionRepository extends CrudRepository<FoodNutritionProducts, Long>{
}