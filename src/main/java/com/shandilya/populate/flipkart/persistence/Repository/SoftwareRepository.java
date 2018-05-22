package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.software.models.SoftwareProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface SoftwareRepository extends CrudRepository<SoftwareProducts, Long> {
}