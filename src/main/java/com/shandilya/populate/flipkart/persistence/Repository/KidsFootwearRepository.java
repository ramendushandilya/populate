package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.kidsfootwear.models.KidsFootwearProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface KidsFootwearRepository extends CrudRepository<KidsFootwearProducts, Long> {
}
