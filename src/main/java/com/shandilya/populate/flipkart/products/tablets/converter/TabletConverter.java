package com.shandilya.populate.flipkart.products.tablets.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.tablets.models.TabletsProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class TabletConverter extends ListConverter<ProductsExt, TabletsProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public TabletsProducts convert(ProductsExt productsExt) {
        return new TabletsProducts(helper.baseInfoHelper(productsExt));
    }
}