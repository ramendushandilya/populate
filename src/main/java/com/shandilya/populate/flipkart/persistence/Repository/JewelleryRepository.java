package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.jewellery.models.JewelleryProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 */
public interface JewelleryRepository extends CrudRepository<JewelleryProducts, Long> {
}