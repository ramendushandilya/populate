package com.shandilya.populate.flipkart.products.stationaryofficesupplies.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.stationaryofficesupplies.models.StationeryProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class StationeryConverter extends ListConverter<ProductsExt, StationeryProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public StationeryProducts convert(ProductsExt productsExt) {
        return new StationeryProducts(helper.baseInfoHelper(productsExt));
    }
}