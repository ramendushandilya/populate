package com.shandilya.populate.flipkart.products.fragrances.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.fragrances.models.FragranceProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class FragrancesConverter extends ListConverter<ProductsExt, FragranceProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public FragranceProducts convert(ProductsExt productsExt) {
        return new FragranceProducts(helper.baseInfoHelper(productsExt));
    }
}