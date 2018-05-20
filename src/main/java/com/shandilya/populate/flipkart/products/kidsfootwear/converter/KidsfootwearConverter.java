package com.shandilya.populate.flipkart.products.kidsfootwear.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.kidsfootwear.models.KidsFootwearProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class KidsfootwearConverter extends ListConverter<ProductsExt, KidsFootwearProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public KidsFootwearProducts convert(ProductsExt productsExt) {
        return new KidsFootwearProducts(helper.baseInfoHelper(productsExt));
    }
}
