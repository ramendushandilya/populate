package com.shandilya.populate.flipkart.products.laptopaccessories.conveter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.laptopaccessories.models.LaptopAccessoriesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class LaptopAccessoriesConveter extends ListConverter<ProductsExt, LaptopAccessoriesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public LaptopAccessoriesProducts convert(ProductsExt productsExt) {
        return new LaptopAccessoriesProducts(helper.baseInfoHelper(productsExt));
    }
}
