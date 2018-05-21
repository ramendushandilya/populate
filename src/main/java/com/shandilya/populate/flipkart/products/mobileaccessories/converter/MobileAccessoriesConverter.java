package com.shandilya.populate.flipkart.products.mobileaccessories.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.mobileaccessories.model.MobileAccessoriesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class MobileAccessoriesConverter extends ListConverter<ProductsExt, MobileAccessoriesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public MobileAccessoriesProducts convert(ProductsExt productsExt) {
        return new MobileAccessoriesProducts(helper.baseInfoHelper(productsExt));
    }
}
