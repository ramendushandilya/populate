package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.toys.models.ToysProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface ToyRepository extends CrudRepository<ToysProducts, Long> {
}