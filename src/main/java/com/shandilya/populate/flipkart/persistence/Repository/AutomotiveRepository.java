package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 4/25/2018
 *         Time: 3:55 PM
 */

public interface AutomotiveRepository extends CrudRepository<AutomotiveProducts, Long> {

}