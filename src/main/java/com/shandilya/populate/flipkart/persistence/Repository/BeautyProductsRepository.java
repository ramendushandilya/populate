package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.groomingbeautywellness.models.BeautyProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 */
public interface BeautyProductsRepository extends CrudRepository<BeautyProducts, Long> {
}