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
     *
     * BaseInfo {
     *     productId
     *     productTitle
     *     productUrl
     *     brand
     *     stock
     *     codAvailable
     *     categoryPath
     *     ImageUrls {
     *
     *     }
     *     FlipkartSellingPrice{
     *
     *     }
     *     Attributes {
     *
     *     }
     *  }
     * @param productsExt
     * @return
     */
    public BaseInfo baseInfoHelper(ProductsExt productsExt) {

        String productId = null;
        String productTitle = null;
        String productUrl = null;
        String brand = null;
        String stock = null;
        String cod = null;
        String categoryPath = null;
        String amount = null;
        String size = null;
        String color = null;
        String storage = null;
        String unit = null;
        String displaySize = null;
        String small = null;
        String medium = null;
        String large = null;
        Attributes attributes = null;
        ImageUrls imageUrls = null;
        BaseInfoExt baseInfoExt = productsExt.getBaseInfoExt();
        if(baseInfoExt != null) {
            productId = baseInfoExt.getProductId() == null ? "null" : baseInfoExt.getProductId();
            productTitle = baseInfoExt.getTitle() == null ? "null" : baseInfoExt.getTitle();
            productUrl = baseInfoExt.getProductUrl() == null ? "null" : baseInfoExt.getProductUrl();
            brand = baseInfoExt.getBrand() == null ? "null" : baseInfoExt.getBrand();
            stock = baseInfoExt.getInStock() == null ? "null" : baseInfoExt.getInStock();
            cod = baseInfoExt.getCodAvailable() == null ? "null" : baseInfoExt.getCodAvailable();
            categoryPath = baseInfoExt.getCategoryPath() == null ? "null" : baseInfoExt.getCategoryPath();
        }

        FlipkartSellingPriceExt fsp = baseInfoExt.getFsp();
        if(fsp != null) {
            amount = fsp.getAmount() == null ? "null" : fsp.getAmount();
        }

        AttributesExt attributesExt = baseInfoExt.getAttributes();
        if(attributesExt != null) {
            size = attributesExt.getSize() == null ? "null" : attributesExt.getSize();
            color = attributesExt.getColor() == null ? "null" : attributesExt.getColor();
            storage = attributesExt.getStorage() == null ? "null" : attributesExt.getStorage();
            unit = attributesExt.getSizeUnit() == null ? "null" : attributesExt.getSizeUnit();
            displaySize = attributesExt.getDisplaySize() == null ? "null" : attributesExt.getDisplaySize();
            attributes = new Attributes(size, color, storage, unit, displaySize);
        }

        ImageUrlsExt imageUrlsExt = baseInfoExt.getImageUrlsExt();
        if(imageUrlsExt != null) {
            small = imageUrlsExt.getSmall();
            medium = imageUrlsExt.getMedium();
            large = imageUrlsExt.getLarge();
            imageUrls = new ImageUrls(small, medium, large);
        }

        // 1. Construct Base Info
        return new BaseInfo(productId, productTitle, imageUrls, amount, productUrl, brand, stock, cod, categoryPath,
                attributes);
    }

    public ShippingInfo shippingInfoHelper(ProductsExt productsExt) {

        ShippingInfoExt shippingInfoExt = productsExt.getShippingInfoExt();
        ShippingChargesExt shippingChargesExt = shippingInfoExt.getShippingChargesExt();

        // 2. Construct Shipping Info
        return new ShippingInfo(shippingChargesExt.getAmount(), shippingInfoExt.getEstimatedDeliveryTime(),
                shippingInfoExt.getSellerAverageRating());
    }
}