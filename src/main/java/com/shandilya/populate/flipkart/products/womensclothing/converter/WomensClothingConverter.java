package com.shandilya.populate.flipkart.products.womensclothing.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.womensclothing.models.WomensClothingProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class WomensClothingConverter extends ListConverter<ProductsExt, WomensClothingProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public WomensClothingProducts convert(ProductsExt productsExt) {
        return new WomensClothingProducts(helper.baseInfoHelper(productsExt));
    }
}