package com.shandilya.populate.flipkart.products.kidsclothing.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.kidsclothing.models.KidsClothingProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class KidsClothingConverter extends ListConverter<ProductsExt, KidsClothingProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public KidsClothingProducts convert(ProductsExt productsExt) {
        return new KidsClothingProducts(helper.baseInfoHelper(productsExt));
    }
}
