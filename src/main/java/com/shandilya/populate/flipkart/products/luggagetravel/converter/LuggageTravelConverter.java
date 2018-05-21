package com.shandilya.populate.flipkart.products.luggagetravel.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.luggagetravel.models.LuggageTravelProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class LuggageTravelConverter extends ListConverter<ProductsExt, LuggageTravelProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public LuggageTravelProducts convert(ProductsExt productsExt) {
        return new LuggageTravelProducts(helper.baseInfoHelper(productsExt));
    }
}
