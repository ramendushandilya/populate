package com.shandilya.populate.flipkart.products.desktops.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.desktops.models.DesktopProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 5:12 PM
 */
@Service
public class DesktopConverter extends ListConverter<ProductsExt, DesktopProducts> {

    @Autowired
    private ConverterHelper converterHelper;

    @Override
    public DesktopProducts convert(ProductsExt productsExt) {
        return new DesktopProducts(converterHelper.baseInfoHelper(productsExt));
    }
}