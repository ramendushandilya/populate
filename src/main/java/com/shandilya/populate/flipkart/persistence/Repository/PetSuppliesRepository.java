package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.petsupplies.models.PetSuppliesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface PetSuppliesRepository extends CrudRepository<PetSuppliesProducts, Long> {
}
