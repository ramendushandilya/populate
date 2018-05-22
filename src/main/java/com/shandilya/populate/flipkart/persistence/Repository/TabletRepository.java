package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.tablets.models.TabletsProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface TabletRepository extends CrudRepository<TabletsProducts, Long> {
}