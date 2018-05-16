package com.shandilya.populate.flipkart.products.audioplayers.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerProducts;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 5/16/2018
 *         Time: 2:22 PM
 */
@Service
public class AudioPlayerConverter extends ListConverter<ProductsExt, AudioPlayerProducts>{

    @Autowired
    private ConverterHelper converterHelper;

    @Override
    public AudioPlayerProducts convert(ProductsExt productsExt) {
        return new AudioPlayerProducts(converterHelper.baseInfoHelper(productsExt));
    }
}