package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.homeimprovementtools.models.HomeImprovementProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 */
public interface HomeImprovementToolsRepository extends CrudRepository<HomeImprovementProducts, Long> {
}