package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.luggagetravel.models.LuggageTravelProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface LuggageTravelRepository extends CrudRepository<LuggageTravelProducts, Long> {
}
