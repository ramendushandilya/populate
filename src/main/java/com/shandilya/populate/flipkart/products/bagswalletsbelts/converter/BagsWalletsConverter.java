package com.shandilya.populate.flipkart.products.bagswalletsbelts.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.bagswalletsbelts.model.BagsWalletsBelts;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */
@Service
public class BagsWalletsConverter extends ListConverter<ProductsExt, BagsWalletsBelts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public BagsWalletsBelts convert(ProductsExt productsExt) {
        return new BagsWalletsBelts(helper.baseInfoHelper(productsExt));
    }
}