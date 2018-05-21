package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.laptopaccessories.models.LaptopAccessoriesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface LaptopAccessoriesRepository extends CrudRepository<LaptopAccessoriesProducts, Long> {
}
