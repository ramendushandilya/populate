package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.computerstorage.model.ComputerStorageProducts;
import org.springframework.data.repository.CrudRepository;

public interface ComputerStorageRepository extends CrudRepository<ComputerStorageProducts, Long> {
}