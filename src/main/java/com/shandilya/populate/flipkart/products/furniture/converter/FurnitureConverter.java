package com.shandilya.populate.flipkart.products.furniture.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.furniture.models.FurnitureProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class FurnitureConverter extends ListConverter<ProductsExt, FurnitureProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public FurnitureProducts convert(ProductsExt productsExt) {
        return new FurnitureProducts(helper.baseInfoHelper(productsExt));
    }
}