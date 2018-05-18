package com.shandilya.populate.flipkart.products.homedecorandfestiveneeds.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.homedecorandfestiveneeds.models.HomeDecorProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class HomeDecorConverter extends ListConverter<ProductsExt, HomeDecorProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public HomeDecorProducts convert(ProductsExt productsExt) {
        return new HomeDecorProducts(helper.baseInfoHelper(productsExt));
    }
}