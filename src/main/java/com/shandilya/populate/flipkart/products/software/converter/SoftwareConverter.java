package com.shandilya.populate.flipkart.products.software.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.software.models.SoftwareProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class SoftwareConverter extends ListConverter<ProductsExt, SoftwareProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public SoftwareProducts convert(ProductsExt productsExt) {
        return new SoftwareProducts(helper.baseInfoHelper(productsExt));
    }
}