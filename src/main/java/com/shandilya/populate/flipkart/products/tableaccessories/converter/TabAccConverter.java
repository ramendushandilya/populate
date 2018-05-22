package com.shandilya.populate.flipkart.products.tableaccessories.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.tableaccessories.models.TabletAccessoriesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class TabAccConverter extends ListConverter<ProductsExt, TabletAccessoriesProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public TabletAccessoriesProducts convert(ProductsExt productsExt) {
        return new TabletAccessoriesProducts(helper.baseInfoHelper(productsExt));
    }
}