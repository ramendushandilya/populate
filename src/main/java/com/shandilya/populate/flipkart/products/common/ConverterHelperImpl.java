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

        BaseInfoExt baseInfoExt = productsExt.getBaseInfoExt();
        ImageUrlsExt imageUrlsExt = baseInfoExt.getImageUrlsExt();
        String small = imageUrlsExt.getSmall() == null ? "null" : imageUrlsExt.getSmall();
        String medium = imageUrlsExt.getMedium() == null ? "null" : imageUrlsExt.getMedium();
        String large = imageUrlsExt.getLarge() == null ? "null" : imageUrlsExt.getLarge();
        ImageUrls imageUrls = new ImageUrls(small, medium, large);
        FlipkartSellingPriceExt fsp = productsExt.getBaseInfoExt().getFsp() == null ? null : productsExt.getBaseInfoExt().getFsp();
        String amount = fsp.getAmount() == null ? "null" : fsp.getAmount();

        AttributesExt attributesExt = baseInfoExt.getAttributes();
        Attributes attributes = new Attributes(attributesExt.getSize(), attributesExt.getColor(),
                                attributesExt.getStorage(), attributesExt.getSizeUnit(),
                                attributesExt.getDisplaySize());

        // 1. Construct Base Info
        return new BaseInfo(baseInfoExt.getProductId(), baseInfoExt.getTitle(), imageUrls, amount,
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