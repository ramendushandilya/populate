package com.shandilya.populate.flipkart.products.computerstorage.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.computerstorage.model.ComputerStorageProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class ComputerStorageConverter extends ListConverter<ProductsExt, ComputerStorageProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public ComputerStorageProducts convert(ProductsExt productsExt) {
        return new ComputerStorageProducts(helper.baseInfoHelper(productsExt));
    }
}