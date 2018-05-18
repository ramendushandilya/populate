package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.homeentertainment.models.HomeEntertainmentProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 */
public interface HomeEntertainmentRepository extends CrudRepository<HomeEntertainmentProducts, Long> {
}