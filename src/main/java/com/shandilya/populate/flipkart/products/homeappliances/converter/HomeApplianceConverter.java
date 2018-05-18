package com.shandilya.populate.flipkart.products.homeappliances.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.homeappliances.models.HomeApplianceProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class HomeApplianceConverter extends ListConverter<ProductsExt, HomeApplianceProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public HomeApplianceProducts convert(ProductsExt productsExt) {
        return new HomeApplianceProducts(helper.baseInfoHelper(productsExt));
    }
}