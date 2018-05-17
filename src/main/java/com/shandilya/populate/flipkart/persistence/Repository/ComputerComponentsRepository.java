package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.computercomponents.model.ComputerComponentsProducts;
import org.springframework.data.repository.CrudRepository;

public interface ComputerComponentsRepository extends CrudRepository<ComputerComponentsProducts, Long> {
}