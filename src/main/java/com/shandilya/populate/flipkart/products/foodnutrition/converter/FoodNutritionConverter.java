package com.shandilya.populate.flipkart.products.foodnutrition.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.common.pojo.ConverterHelper;
import com.shandilya.populate.flipkart.products.foodnutrition.models.FoodNutritionProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author failedOptimus
 */

@Service
public class FoodNutritionConverter extends ListConverter<ProductsExt, FoodNutritionProducts> {

    @Autowired
    private ConverterHelper helper;

    @Override
    public FoodNutritionProducts convert(ProductsExt productsExt) {
        return new FoodNutritionProducts(helper.baseInfoHelper(productsExt));
    }
}