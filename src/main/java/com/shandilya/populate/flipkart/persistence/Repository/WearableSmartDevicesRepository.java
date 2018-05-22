package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.wearablesmartdevices.models.WearableSmartDevicesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface WearableSmartDevicesRepository extends CrudRepository<WearableSmartDevicesProducts, Long> {
}