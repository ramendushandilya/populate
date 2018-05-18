package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.gaming.models.GamingProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 */
public interface GamingRepository extends CrudRepository<GamingProducts, Long> {
}