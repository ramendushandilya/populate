package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.sunglasses.models.SunglassesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface SunglassesRepository extends CrudRepository<SunglassesProducts, Long> {
}