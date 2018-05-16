package com.shandilya.populate.flipkart.products.common;

import com.shandilya.populate.flipkart.external.domains.urlcommons.*;
import com.shandilya.populate.flipkart.products.common.pojo.*;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 12:41 PM
 */

@Service
public class ConverterHelperImpl implements ConverterHelper{

    /**
     * BaseInfo members
     * productId
     * ProductTitle
     * ImageUrls
     * flipkartSellingPrice
     * productUrl
     * brand
     * inStock
     * codAvailable
     * string []offers
     * categoryPath
     * attributes
     * @param productsExt
     * @return
     */
    public BaseInfo baseInfoHelper(ProductsExt productsExt) {

        //TODO Fix check for null fields while converting

        BaseInfoExt baseInfoExt = productsExt.getBaseInfoExt();
        ImageUrlsExt imageUrlsExt = baseInfoExt.getImageUrlsExt();
        ImageUrls imageUrls = new ImageUrls(imageUrlsExt.getSmall(), imageUrlsExt.getMedium(), imageUrlsExt.getLarge());
        FlipkartSellingPriceExt fsp = productsExt.getBaseInfoExt().getFsp();

        AttributesExt attributesExt = baseInfoExt.getAttributes();
        Attributes attributes = new Attributes(attributesExt.getSize(), attributesExt.getColor(),
                                attributesExt.getStorage(), attributesExt.getSizeUnit(),
                                attributesExt.getDisplaySize());

        // 1. Construct Base Info
        return new BaseInfo(baseInfoExt.getProductId(), baseInfoExt.getTitle(), imageUrls, fsp.getAmount(),
                   baseInfoExt.getProductUrl(), baseInfoExt.getBrand(), baseInfoExt.getInStock(),
                   baseInfoExt.getCodAvailable(), baseInfoExt.getCategoryPath(), attributes);
    }

    public ShippingInfo shippingInfoHelper(ProductsExt productsExt) {

        ShippingInfoExt shippingInfoExt = productsExt.getShippingInfoExt();
        ShippingChargesExt shippingChargesExt = shippingInfoExt.getShippingChargesExt();

        // 2. Construct Shipping Info
        return new ShippingInfo(shippingChargesExt.getAmount(), shippingInfoExt.getEstimatedDeliveryTime(),
                shippingInfoExt.getSellerAverageRating());
    }
}