package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.computerperipherals.model.ComputerPeripheralsProducts;
import org.springframework.data.repository.CrudRepository;

public interface ComputerPeripheralsRepository extends CrudRepository<ComputerPeripheralsProducts, Long> {
}