package com.shandilya.populate.flipkart.products.refrigerator.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.refrigerator.models.RefrigeratorProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class RefrigeratorConverter extends ListConverter<ProductsExt, RefrigeratorProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public RefrigeratorProducts convert(ProductsExt productsExt) {
        return new RefrigeratorProducts(helper.baseInfoHelper(productsExt));
    }
}