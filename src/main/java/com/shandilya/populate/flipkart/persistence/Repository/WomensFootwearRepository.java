package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.womensfootwear.models.WomensFootwearProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface WomensFootwearRepository extends CrudRepository<WomensFootwearProducts, Long> {
}