package com.shandilya.populate.flipkart.products.petsupplies.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.petsupplies.models.PetSuppliesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class PetSupplyConverter extends ListConverter<ProductsExt, PetSuppliesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public PetSuppliesProducts convert(ProductsExt productsExt) {
        return new PetSuppliesProducts(helper.baseInfoHelper(productsExt));
    }
}
