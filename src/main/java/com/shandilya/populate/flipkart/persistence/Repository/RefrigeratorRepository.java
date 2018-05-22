package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.refrigerator.models.RefrigeratorProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface RefrigeratorRepository extends CrudRepository<RefrigeratorProducts, Long> {
}