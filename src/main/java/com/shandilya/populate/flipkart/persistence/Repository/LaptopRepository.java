package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.laptops.models.LaptopsModels;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface LaptopRepository extends CrudRepository<LaptopsModels, Long> {
}
