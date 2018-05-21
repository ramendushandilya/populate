package com.shandilya.populate.flipkart.products.mobiles.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.mobiles.models.MobileProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class MobilesConverter extends ListConverter<ProductsExt, MobileProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public MobileProducts convert(ProductsExt productsExt) {
        return new MobileProducts(helper.baseInfoHelper(productsExt));
    }
}
