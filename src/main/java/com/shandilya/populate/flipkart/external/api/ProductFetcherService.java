package com.shandilya.populate.flipkart.external.api;

import com.shandilya.populate.flipkart.products.airconditioner.model.AcProducts;

import java.util.List;

public interface ProductFetcherService {

    public List<AcProducts> getAllAirconditioners(String acSeed);

}
