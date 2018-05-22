package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.televisions.models.TelevisionProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface TelevisionRepository extends CrudRepository<TelevisionProducts, Long> {
}