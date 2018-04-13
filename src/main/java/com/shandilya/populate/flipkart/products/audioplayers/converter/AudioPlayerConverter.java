package com.shandilya.populate.flipkart.products.audioplayers.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.BaseInfoExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ImageUrlsExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerCategorySpecificInfo;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerImageUrls;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerProductBaseInfo;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerProducts;
import org.springframework.stereotype.Service;

@Service
public class AudioPlayerConverter extends ListConverter<ProductsExt, AudioPlayerProducts>{

    @Override
    public AudioPlayerProducts convert(ProductsExt productsExt) {
        AudioPlayerProductBaseInfo baseInfo = null;
        AudioPlayerCategorySpecificInfo categorySpecificInfo = null;
        if(productsExt != null) {
            BaseInfoExt info = productsExt.getBaseInfoExt();
            if(info != null) {
                ImageUrlsExt urlsExt = info.getImageUrlsExt();
                String small = urlsExt.getSmall();
                String medium = urlsExt.getMedium();
                String large = urlsExt.getLarge();
                String price = (info.getFsp() == null) ? null : info.getFsp().getAmount() ;//info.getFsp().getAmount();
                AudioPlayerImageUrls urls = new AudioPlayerImageUrls(small, medium, large);
                baseInfo = new AudioPlayerProductBaseInfo(info.getProductId(), info.getTitle(),
                        urls, price, info.getProductUrl(), info.getBrand(),
                        info.getInStock(), info.getOffers());
            }
            if(productsExt.getBaseInfoExt() != null) {
                 categorySpecificInfo = new AudioPlayerCategorySpecificInfo(productsExt.getCateforySpecificInfo()
                        .getDetailedSpecs());
            }
            return new AudioPlayerProducts(baseInfo, categorySpecificInfo);
        }
        return null;
    }
}