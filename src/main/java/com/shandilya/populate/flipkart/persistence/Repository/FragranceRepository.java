package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.fragrances.models.FragranceProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author FoodNutritionProducts
 */
public interface FragranceRepository extends CrudRepository<FragranceProducts, Long> {
}