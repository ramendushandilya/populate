package com.shandilya.populate.flipkart.external.api.impl;

import com.shandilya.populate.flipkart.external.api.ProductFetcherService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcProducts;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductFetcherServiceImpl implements ProductFetcherService {

    @Autowired
    private ProductUrlAggregatorService urlAggregatorService;

    @Autowired
    private PopulateConversionService conversionService;

    @Override
    public List<AcProducts> getAllAirconditioners(String acSeed) {

        List<ProductsExt> productsExtList = urlAggregatorService.getAllProducts(acSeed);
        return conversionService.convert(productsExtList, AcProducts.class);
    }
}