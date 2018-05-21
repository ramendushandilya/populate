package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.mensclothing.models.MensClothingProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface MensClothingRespository extends CrudRepository<MensClothingProducts, Long> {
}
