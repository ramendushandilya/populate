package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.stationaryofficesupplies.models.StationeryProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface StationeryRepository extends CrudRepository<StationeryProducts, Long> {
}