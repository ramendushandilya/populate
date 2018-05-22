package com.shandilya.populate.flipkart.products.womensfootwear.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.womensfootwear.models.WomensFootwearProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class WomensFootwearConverter extends ListConverter<ProductsExt, WomensFootwearProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public WomensFootwearProducts convert(ProductsExt productsExt) {
        return new WomensFootwearProducts(helper.baseInfoHelper(productsExt));
    }
}