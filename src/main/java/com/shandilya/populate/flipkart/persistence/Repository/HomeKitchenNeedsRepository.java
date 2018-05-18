package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.homekitchenneeds.models.HomeKitchenProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 5/18/2018
 *         Time: 9:25 PM
 */
public interface HomeKitchenNeedsRepository extends CrudRepository<HomeKitchenProducts, Long> {
}