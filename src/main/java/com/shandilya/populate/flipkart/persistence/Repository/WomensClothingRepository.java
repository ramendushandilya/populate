package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.womensclothing.models.WomensClothingProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface WomensClothingRepository extends CrudRepository<WomensClothingProducts, Long> {
}