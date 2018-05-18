package com.shandilya.populate.flipkart.products.jewellery.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.jewellery.models.JewelleryProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 */

@Service
public class JewelleryConverter extends ListConverter<ProductsExt, JewelleryProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public JewelleryProducts convert(ProductsExt productsExt) {
        return new JewelleryProducts(helper.baseInfoHelper(productsExt));
    }
}