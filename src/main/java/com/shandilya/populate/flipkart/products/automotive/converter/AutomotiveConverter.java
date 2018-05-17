package com.shandilya.populate.flipkart.products.automotive.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveProducts;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * failedOptimus
 */
@Service
public class AutomotiveConverter extends ListConverter<ProductsExt, AutomotiveProducts >{

    @Autowired
    private ConverterHelper converterHelper;

    @Override
    public AutomotiveProducts convert(ProductsExt productsExt) {
        return new AutomotiveProducts(converterHelper.baseInfoHelper(productsExt));
    }
}