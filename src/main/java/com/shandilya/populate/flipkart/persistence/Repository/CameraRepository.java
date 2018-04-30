package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.camera.model.CameraProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 12:51 PM
 */
public interface CameraRepository extends CrudRepository<CameraProducts, Long> {


}