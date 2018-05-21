package com.shandilya.populate.flipkart.products.laptops.conveter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.laptops.models.LaptopsModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class LaptopConveter extends ListConverter<ProductsExt, LaptopsModels>{

    @Autowired
    private ConverterHelper helper;

    @Override
    public LaptopsModels convert(ProductsExt productsExt) {
        return new LaptopsModels(helper.baseInfoHelper(productsExt));
    }
}
