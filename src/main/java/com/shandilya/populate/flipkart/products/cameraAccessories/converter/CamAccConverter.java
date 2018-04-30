package com.shandilya.populate.flipkart.products.cameraAccessories.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.cameraAccessories.model.CameraAccessories;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 12:39 PM
 */
@Service
public class CamAccConverter extends ListConverter<ProductsExt, CameraAccessories>{

    @Autowired
    private ConverterHelper converterHelper;

    @Override
    public CameraAccessories convert(ProductsExt productsExt) {

        return new CameraAccessories(converterHelper.baseInfoHelper(productsExt));
    }
}