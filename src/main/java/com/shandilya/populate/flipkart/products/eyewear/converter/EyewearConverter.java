package com.shandilya.populate.flipkart.products.eyewear.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.eyewear.models.EyewearProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class EyewearConverter extends ListConverter<ProductsExt, EyewearProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public EyewearProducts convert(ProductsExt productsExt) {
        return new EyewearProducts(helper.baseInfoHelper(productsExt));
    }
}