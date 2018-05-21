package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.microwaveovens.models.MicrowaveOvenProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface MicrowaveOvenRepository extends CrudRepository<MicrowaveOvenProducts, Long> {
}
