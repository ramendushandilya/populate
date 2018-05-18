package com.shandilya.populate.flipkart.products.homeimprovementtools.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.homeimprovementtools.models.HomeImprovementProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class HomeImprovementConverter extends ListConverter<ProductsExt, HomeImprovementProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public HomeImprovementProducts convert(ProductsExt productsExt) {
        return new HomeImprovementProducts(helper.baseInfoHelper(productsExt));
    }
}