package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.babycare.model.BabycareProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface BabycareRepository extends CrudRepository<BabycareProducts, Long> {
}