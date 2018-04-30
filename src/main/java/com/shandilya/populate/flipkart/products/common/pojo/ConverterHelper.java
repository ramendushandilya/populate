package com.shandilya.populate.flipkart.products.common.pojo;

import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 12:44 PM
 */
public interface ConverterHelper {

    BaseInfo baseInfoHelper(ProductsExt productsExt);

    ShippingInfo shippingInfoHelper(ProductsExt productsExt);
}