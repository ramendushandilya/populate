package com.shandilya.populate.flipkart.products.networkcomponents.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.networkcomponents.models.NetworkComponentProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class NetworkComponentConverter extends ListConverter<ProductsExt, NetworkComponentProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public NetworkComponentProducts convert(ProductsExt productsExt) {
        return new NetworkComponentProducts(helper.baseInfoHelper(productsExt));
    }
}
