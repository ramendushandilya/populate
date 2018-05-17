package com.shandilya.populate.flipkart.products.computerperipherals.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.computerperipherals.model.ComputerPeripheralsProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class ComputerPeripheralsConverter extends ListConverter<ProductsExt, ComputerPeripheralsProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public ComputerPeripheralsProducts convert(ProductsExt productsExt) {
        return new ComputerPeripheralsProducts(helper.baseInfoHelper(productsExt));
    }
}