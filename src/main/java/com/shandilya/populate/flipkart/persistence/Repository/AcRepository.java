package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.airconditioners.model.AirconditionerProducts;
import org.springframework.data.repository.CrudRepository;

public interface AcRepository extends CrudRepository<AirconditionerProducts, Long>{

}