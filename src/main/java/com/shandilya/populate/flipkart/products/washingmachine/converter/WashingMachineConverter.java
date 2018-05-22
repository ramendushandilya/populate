package com.shandilya.populate.flipkart.products.washingmachine.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.washingmachine.models.WashingMachineProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class WashingMachineConverter extends ListConverter<ProductsExt, WashingMachineProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public WashingMachineProducts convert(ProductsExt productsExt) {
        return new WashingMachineProducts(helper.baseInfoHelper(productsExt));
    }
}