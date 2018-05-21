package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.mensfootwear.models.MensFootwearProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface MensFootwearRepository extends CrudRepository<MensFootwearProducts, Long> {
}
