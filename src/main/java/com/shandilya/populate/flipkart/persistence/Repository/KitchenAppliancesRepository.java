package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.kitchenappliances.models.KitchenApplianceProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface KitchenAppliancesRepository extends CrudRepository<KitchenApplianceProducts, Long> {
}
