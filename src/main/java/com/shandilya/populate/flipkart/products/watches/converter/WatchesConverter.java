package com.shandilya.populate.flipkart.products.watches.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.watches.models.WatchesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class WatchesConverter extends ListConverter<ProductsExt, WatchesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public WatchesProducts convert(ProductsExt productsExt) {
        return new WatchesProducts(helper.baseInfoHelper(productsExt));
    }
}