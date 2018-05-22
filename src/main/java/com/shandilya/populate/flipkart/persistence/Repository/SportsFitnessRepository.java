package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.sportsfitness.models.SportFitnessProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface SportsFitnessRepository extends CrudRepository<SportFitnessProducts, Long> {
}