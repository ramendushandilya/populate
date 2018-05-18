package com.shandilya.populate.flipkart.products.householdsupplies.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.householdsupplies.models.HouseHoldSuppliesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class HouseHoldSuppliesConverter extends ListConverter<ProductsExt, HouseHoldSuppliesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public HouseHoldSuppliesProducts convert(ProductsExt productsExt) {
        return new HouseHoldSuppliesProducts(helper.baseInfoHelper(productsExt));
    }
}