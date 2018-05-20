package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.kidsclothing.models.KidsClothingProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface KidsClothingRepository extends CrudRepository<KidsClothingProducts, Long> {
}
