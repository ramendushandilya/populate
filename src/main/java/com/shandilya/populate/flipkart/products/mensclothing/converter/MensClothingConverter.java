package com.shandilya.populate.flipkart.products.mensclothing.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.mensclothing.models.MensClothingProducts;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author failedOptimus
 */

@Service
public class MensClothingConverter extends ListConverter<ProductsExt, MensClothingProducts> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private ConverterHelper helper;

    @Override
    public MensClothingProducts convert(ProductsExt productsExt) {
        return new MensClothingProducts(helper.baseInfoHelper(productsExt));
    }
}
