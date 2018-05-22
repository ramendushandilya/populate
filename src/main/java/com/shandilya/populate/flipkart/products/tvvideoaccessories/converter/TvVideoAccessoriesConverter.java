package com.shandilya.populate.flipkart.products.tvvideoaccessories.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.tvvideoaccessories.models.TvVideoAccessoriesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class TvVideoAccessoriesConverter extends ListConverter<ProductsExt, TvVideoAccessoriesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public TvVideoAccessoriesProducts convert(ProductsExt productsExt) {
        return new TvVideoAccessoriesProducts(helper.baseInfoHelper(productsExt));
    }
}