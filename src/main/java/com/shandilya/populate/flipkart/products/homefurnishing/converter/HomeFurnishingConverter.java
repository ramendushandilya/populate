package com.shandilya.populate.flipkart.products.homefurnishing.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.homefurnishing.models.HomeFurnishingProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class HomeFurnishingConverter extends ListConverter<ProductsExt, HomeFurnishingProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public HomeFurnishingProducts convert(ProductsExt productsExt) {
        return new HomeFurnishingProducts(helper.baseInfoHelper(productsExt));
    }
}