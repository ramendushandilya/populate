package com.shandilya.populate.flipkart.products.homekitchenneeds.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.homekitchenneeds.models.HomeKitchenProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class HomeKitchenConverter extends ListConverter<ProductsExt, HomeKitchenProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public HomeKitchenProducts convert(ProductsExt productsExt) {
        return new HomeKitchenProducts(helper.baseInfoHelper(productsExt));
    }
}