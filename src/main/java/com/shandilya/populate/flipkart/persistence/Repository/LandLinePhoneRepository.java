package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.landlinephones.models.LandLinePhoneProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface LandLinePhoneRepository extends CrudRepository<LandLinePhoneProducts, Long> {
}
