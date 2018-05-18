package com.shandilya.populate.flipkart.products.elearning.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.elearning.models.ElearningProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class ElearningConverter extends ListConverter<ProductsExt, ElearningProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public ElearningProducts convert(ProductsExt productsExt) {
        return new ElearningProducts(helper.baseInfoHelper(productsExt));
    }
}