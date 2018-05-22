package com.shandilya.populate.flipkart.products.videoplayers.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.videoplayers.models.VideoPlayersProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class VideoPlayersConverter extends ListConverter<ProductsExt, VideoPlayersProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public VideoPlayersProducts convert(ProductsExt productsExt) {
        return new VideoPlayersProducts(helper.baseInfoHelper(productsExt));
    }
}