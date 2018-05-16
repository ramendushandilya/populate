package com.shandilya.populate.flipkart.products.airconditioners.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.airconditioners.model.AirconditionerProducts;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 5/16/2018
 *         Time: 1:42 PM
 */
@Service
public class AirconditionerConverter extends ListConverter<ProductsExt, AirconditionerProducts> {

    @Autowired
    private ConverterHelper converterHelper;

    @Override
    public AirconditionerProducts convert(ProductsExt productsExt) {
        return new AirconditionerProducts(converterHelper.baseInfoHelper(productsExt));
    }
}