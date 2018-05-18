package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.homefurnishing.models.HomeFurnishingProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 */
public interface HomeFurnishingRepository extends CrudRepository<HomeFurnishingProducts, Long> {
}