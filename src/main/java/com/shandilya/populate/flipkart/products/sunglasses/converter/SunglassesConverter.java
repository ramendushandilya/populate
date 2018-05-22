package com.shandilya.populate.flipkart.products.sunglasses.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.sunglasses.models.SunglassesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class SunglassesConverter extends ListConverter<ProductsExt, SunglassesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public SunglassesProducts convert(ProductsExt productsExt) {
        return new SunglassesProducts(helper.baseInfoHelper(productsExt));
    }
}