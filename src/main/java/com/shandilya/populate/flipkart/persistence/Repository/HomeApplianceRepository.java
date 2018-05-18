package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.homeappliances.models.HomeApplianceProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 */
public interface HomeApplianceRepository extends CrudRepository<HomeApplianceProducts, Long> {
}