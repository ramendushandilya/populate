package com.shandilya.populate.flipkart.products.landlinephones.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.landlinephones.models.LandLinePhoneProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class LandlinePhonesConverter extends ListConverter<ProductsExt, LandLinePhoneProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public LandLinePhoneProducts convert(ProductsExt productsExt) {
        return new LandLinePhoneProducts(helper.baseInfoHelper(productsExt));
    }
}
