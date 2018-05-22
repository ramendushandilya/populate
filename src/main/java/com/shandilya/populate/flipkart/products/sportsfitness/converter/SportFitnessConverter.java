package com.shandilya.populate.flipkart.products.sportsfitness.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.sportsfitness.models.SportFitnessProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class SportFitnessConverter extends ListConverter<ProductsExt, SportFitnessProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public SportFitnessProducts convert(ProductsExt productsExt) {
        return new SportFitnessProducts(helper.baseInfoHelper(productsExt));
    }
}