package com.shandilya.populate.flipkart.products.babycare.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.babycare.model.BabycareProducts;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class BabycareConverter extends ListConverter<ProductsExt, BabycareProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public BabycareProducts convert(ProductsExt productsExt) {
        return new BabycareProducts(helper.baseInfoHelper(productsExt));
    }
}