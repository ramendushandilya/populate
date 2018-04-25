package com.shandilya.populate.flipkart.products.automotive.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.BaseInfoExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ImageUrlsExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveCategorySpecificInfo;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveProductBaseInfo;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveProducts;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveUrls;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/25/2018
 *         Time: 3:48 PM
 */
@Service
public class AutomotiveConverter extends ListConverter<ProductsExt, AutomotiveProducts> {

    @Override
    public AutomotiveProducts convert(ProductsExt productsExt) {
        AutomotiveProductBaseInfo baseInfo = null;
        AutomotiveCategorySpecificInfo categorySpecificInfo = null;
        if(productsExt != null) {
            BaseInfoExt info = productsExt.getBaseInfoExt();
            if(info != null) {
                ImageUrlsExt urlsExt = info.getImageUrlsExt();
                String small = urlsExt.getSmall();
                String medium = urlsExt.getMedium();
                String large = urlsExt.getLarge();
                String price = (info.getFsp() == null) ? null : info.getFsp().getAmount() ;//info.getFsp().getAmount();
                AutomotiveUrls urls = new AutomotiveUrls(small, medium, large);
                baseInfo = new AutomotiveProductBaseInfo(info.getProductId(), info.getTitle(),
                        urls, price, info.getProductUrl(), info.getBrand(),
                        info.getInStock(), info.getOffers());
            }
            if(productsExt.getBaseInfoExt() != null) {
                categorySpecificInfo = new AutomotiveCategorySpecificInfo(productsExt.getCateforySpecificInfo()
                        .getDetailedSpecs());
            }
            return new AutomotiveProducts(categorySpecificInfo, baseInfo);
        }
        return null;
    }
}