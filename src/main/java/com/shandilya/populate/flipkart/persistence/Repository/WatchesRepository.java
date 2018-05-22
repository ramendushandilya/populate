package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.watches.models.WatchesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface WatchesRepository extends CrudRepository<WatchesProducts, Long> {
}