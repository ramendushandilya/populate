package com.shandilya.populate.flipkart.persistence.services.impl;

import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.persistence.Repository.AcRepository;
import com.shandilya.populate.flipkart.persistence.services.CategoryPersistenceService;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryPersistenceServiceImpl implements CategoryPersistenceService {

    @Autowired
    private PopulateConversionService conversionService;

    @Autowired
    private AcRepository acRepository;

    @Autowired
    private ProductUrlAggregatorService aggregatorService;

    @Override
    public void saveAcs() {
        acRepository.saveAll(conversionService.convert(
                aggregatorService.getAllProducts("AirConditioners"), AcProducts.class));

        /*List<ProductsExt> products = aggregatorService.getAllProducts("AirConditioners");
        for(ProductsExt p : products) {
            System.out.println(p);
        }
        System.out.println(products.size());*/
    }
}