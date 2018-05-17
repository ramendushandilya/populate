package com.shandilya.populate.flipkart.products.computercomponents.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.computercomponents.model.ComputerComponentsProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */
@Service
public class ComputerComponentsConverter extends ListConverter<ProductsExt, ComputerComponentsProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public ComputerComponentsProducts convert(ProductsExt productsExt) {
        return new ComputerComponentsProducts(helper.baseInfoHelper(productsExt));
    }
}