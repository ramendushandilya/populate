package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.mobiles.models.MobileProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface MobilesRepository extends CrudRepository<MobileProducts, Long> {
}
