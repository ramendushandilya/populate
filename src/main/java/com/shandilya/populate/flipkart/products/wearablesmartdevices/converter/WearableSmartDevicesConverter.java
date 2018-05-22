package com.shandilya.populate.flipkart.products.wearablesmartdevices.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.wearablesmartdevices.models.WearableSmartDevicesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class WearableSmartDevicesConverter extends ListConverter<ProductsExt, WearableSmartDevicesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public WearableSmartDevicesProducts convert(ProductsExt productsExt) {
        return new WearableSmartDevicesProducts(helper.baseInfoHelper(productsExt));
    }
}