package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.desktops.models.DesktopProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 5:16 PM
 */
public interface DesktopRepository extends CrudRepository<DesktopProducts, Long>{

}