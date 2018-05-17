package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.bagswalletsbelts.model.BagsWalletsBelts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */
public interface BagsWalletRepository extends CrudRepository<BagsWalletsBelts, Long> {
}