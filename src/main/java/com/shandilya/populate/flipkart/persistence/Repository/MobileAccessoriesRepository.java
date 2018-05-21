package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.mobileaccessories.model.MobileAccessoriesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface MobileAccessoriesRepository extends CrudRepository<MobileAccessoriesProducts, Long> {
}
