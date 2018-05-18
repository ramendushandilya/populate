package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.furniture.models.FurnitureProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface FurnitureRespository extends CrudRepository<FurnitureProducts, Long> {
}