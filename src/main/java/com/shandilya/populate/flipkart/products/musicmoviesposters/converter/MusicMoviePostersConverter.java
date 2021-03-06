package com.shandilya.populate.flipkart.products.musicmoviesposters.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.musicmoviesposters.models.MusicMoviesPostersProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class MusicMoviePostersConverter extends ListConverter<ProductsExt, MusicMoviesPostersProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public MusicMoviesPostersProducts convert(ProductsExt productsExt) {
        return new MusicMoviesPostersProducts(helper.baseInfoHelper(productsExt));
    }
}
