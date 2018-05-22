package com.shandilya.populate.flipkart.products.televisions.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.televisions.models.TelevisionProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class TelevisionConverter extends ListConverter<ProductsExt, TelevisionProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public TelevisionProducts convert(ProductsExt productsExt) {
        return new TelevisionProducts(helper.baseInfoHelper(productsExt));
    }
}