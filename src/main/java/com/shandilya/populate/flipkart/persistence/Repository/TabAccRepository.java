package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.tableaccessories.models.TabletAccessoriesProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface TabAccRepository extends CrudRepository<TabletAccessoriesProducts, Long> {
}