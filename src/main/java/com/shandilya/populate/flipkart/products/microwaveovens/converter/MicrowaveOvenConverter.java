package com.shandilya.populate.flipkart.products.microwaveovens.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.microwaveovens.models.MicrowaveOvenProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class MicrowaveOvenConverter extends ListConverter<ProductsExt, MicrowaveOvenProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public MicrowaveOvenProducts convert(ProductsExt productsExt) {
        return new MicrowaveOvenProducts(helper.baseInfoHelper(productsExt));
    }
}
