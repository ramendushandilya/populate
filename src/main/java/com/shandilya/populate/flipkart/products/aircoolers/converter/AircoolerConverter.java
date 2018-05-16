package com.shandilya.populate.flipkart.products.aircoolers.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.aircoolers.model.AircoolerProducts;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 5/16/2018
 *         Time: 2:03 PM
 */
@Service
public class AircoolerConverter extends ListConverter<ProductsExt, AircoolerProducts> {

    @Autowired
    private ConverterHelper converterHelper;

    @Override
    public AircoolerProducts convert(ProductsExt productsExt) {
        return new AircoolerProducts(converterHelper.baseInfoHelper(productsExt));
    }
}