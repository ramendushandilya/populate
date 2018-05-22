package com.shandilya.populate.flipkart.products.toys.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.toys.models.ToysProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class ToyConverter extends ListConverter<ProductsExt, ToysProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public ToysProducts convert(ProductsExt productsExt) {
        return new ToysProducts(helper.baseInfoHelper(productsExt));
    }
}