package com.shandilya.populate.flipkart.products.homeentertainment.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.homeentertainment.models.HomeEntertainmentProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class HomeEntertainmentConverter extends ListConverter<ProductsExt, HomeEntertainmentProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public HomeEntertainmentProducts convert(ProductsExt productsExt) {
        return new HomeEntertainmentProducts(helper.baseInfoHelper(productsExt));
    }
}