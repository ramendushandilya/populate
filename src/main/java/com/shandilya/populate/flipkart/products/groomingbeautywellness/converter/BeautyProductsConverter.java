package com.shandilya.populate.flipkart.products.groomingbeautywellness.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.groomingbeautywellness.models.BeautyProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class BeautyProductsConverter extends ListConverter<ProductsExt, BeautyProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public BeautyProducts convert(ProductsExt productsExt) {
        return new BeautyProducts(helper.baseInfoHelper(productsExt));
    }
}