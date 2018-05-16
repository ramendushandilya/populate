package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.aircoolers.model.AircoolerProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 5/16/2018
 *         Time: 2:10 PM
 */
public interface AircoolerRepository extends CrudRepository<AircoolerProducts, Long> {
}