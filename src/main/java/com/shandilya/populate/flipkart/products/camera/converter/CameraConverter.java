package com.shandilya.populate.flipkart.products.camera.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.camera.model.CameraProducts;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:55 PM
 */
@Service
public class CameraConverter extends ListConverter<ProductsExt, CameraProducts> {

    @Override
    public CameraProducts convert(ProductsExt productsExt) {
        return null;
    }
}