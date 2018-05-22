package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.tvvideoaccessories.models.TvVideoAccessoriesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface TvVideoAccessoriesRepository extends CrudRepository<TvVideoAccessoriesProducts, Long> {
}