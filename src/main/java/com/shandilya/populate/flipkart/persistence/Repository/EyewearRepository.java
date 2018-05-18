package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.eyewear.models.EyewearProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface EyewearRepository extends CrudRepository<EyewearProducts, Long> {
}