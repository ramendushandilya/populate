package com.shandilya.populate.flipkart.external.api;

import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;

import java.util.List;

public interface ProductUrlAggregatorService {

    public List<ProductsExt> getAllProducts(String categoryType, int pageLimit);
}