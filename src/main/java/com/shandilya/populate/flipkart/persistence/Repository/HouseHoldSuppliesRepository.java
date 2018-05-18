package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.householdsupplies.models.HouseHoldSuppliesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface HouseHoldSuppliesRepository extends CrudRepository<HouseHoldSuppliesProducts, Long> {
}