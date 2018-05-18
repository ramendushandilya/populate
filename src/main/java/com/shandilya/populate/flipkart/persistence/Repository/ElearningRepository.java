package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.elearning.models.ElearningProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface ElearningRepository extends CrudRepository<ElearningProducts, Long> {
}