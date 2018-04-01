package com.shandilya.populate.flipkart.products.airconditioner.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.BaseInfoExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ImageUrlsExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcCategorySpecificInfo;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcImageUrls;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcProductBaseInfo;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcProducts;
import org.springframework.stereotype.Service;

@Service
public class AcConverter extends ListConverter<ProductsExt, AcProducts>{

    @Override
    public AcProducts convert(ProductsExt productsExt) {
        AcProductBaseInfo baseInfo = null;
        AcCategorySpecificInfo categorySpecificInfo = null;
        if(productsExt != null) {
            BaseInfoExt info = productsExt.getBaseInfoExt();
            if(info != null) {
                ImageUrlsExt urlsExt = info.getImageUrlsExt();
                String small = urlsExt.getSmall();
                String medium = urlsExt.getMedium();
                String large = urlsExt.getLarge();
                String price = info.getFsp().getAmount();
                AcImageUrls urls = new AcImageUrls(small, medium, large);
                baseInfo = new AcProductBaseInfo(info.getProductId(), info.getTitle(),
                        urls, price, info.getProductUrl(), info.getBrand(),
                        info.getInStock(), info.getOffers());
            }
            if(productsExt.getBaseInfoExt() != null) {
                 categorySpecificInfo = new AcCategorySpecificInfo(productsExt.getCateforySpecificInfo()
                        .getDetailedSpecs());
            }
            return new AcProducts(baseInfo, categorySpecificInfo);
        }
        return null;
    }
}