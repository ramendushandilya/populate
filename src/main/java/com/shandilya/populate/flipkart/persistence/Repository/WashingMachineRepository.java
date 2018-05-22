package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.washingmachine.models.WashingMachineProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface WashingMachineRepository extends CrudRepository<WashingMachineProducts, Long> {
}