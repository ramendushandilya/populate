package com.shandilya.populate.flipkart.products.mensfootwear.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.mensfootwear.models.MensFootwearProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class MensFootwearConverter extends ListConverter<ProductsExt, MensFootwearProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public MensFootwearProducts convert(ProductsExt productsExt) {
        return new MensFootwearProducts(helper.baseInfoHelper(productsExt));
    }
}
