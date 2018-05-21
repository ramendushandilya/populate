package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.networkcomponents.models.NetworkComponentProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface NetworkComponentRepository extends CrudRepository<NetworkComponentProducts, Long> {
}
