package com.shandilya.populate.flipkart.products.camera.converter;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
import com.shandilya.populate.flipkart.external.domains.urlcommons.*;
import com.shandilya.populate.flipkart.external.domains.urlcommons.SpecificationList;
import com.shandilya.populate.flipkart.products.camera.model.CameraProducts;
import com.shandilya.populate.flipkart.products.common.pojo.*;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:55 PM
 */
@Service
public class CameraConverter extends ListConverter<ProductsExt, CameraProducts> {

    @Override
    public CameraProducts convert(ProductsExt productsExt) {
        ImageUrlsExt imageUrlsExt = productsExt.getBaseInfoExt().getImageUrlsExt();
        ImageUrls imageUrls = new ImageUrls(imageUrlsExt.getSmall(), imageUrlsExt.getMedium(), imageUrlsExt.getLarge());
        FlipkartSellingPriceExt fsp = productsExt.getBaseInfoExt().getFsp();
        BaseInfoExt baseInfoExt = productsExt.getBaseInfoExt();
        String[] offers = baseInfoExt.getOffers();
        AttributesExt attributesExt = baseInfoExt.getAttributes();
        Attributes attributes = new Attributes(attributesExt.getSize(), attributesExt.getColor(), attributesExt.getStorage(),
                attributesExt.getSizeUnit(), attributesExt.getDisplaySize());

        //Construct Base Info
        BaseInfo baseInfo = new BaseInfo(baseInfoExt.getProductId(), baseInfoExt.getTitle(), imageUrls, fsp.getAmount(),
                baseInfoExt.getProductUrl(), baseInfoExt.getBrand(), baseInfoExt.getInStock(), baseInfoExt.getCodAvailable(),
                offers, baseInfoExt.getCategoryPath(), attributes);

        ShippingInfoExt shippingInfoExt = productsExt.getShippingInfoExt();
        ShippingChargesExt shippingChargesExt = shippingInfoExt.getShippingChargesExt();

        //Construct Shipping Info
        ShippingInfo shippingInfo = new ShippingInfo(shippingChargesExt.getAmount(), shippingInfoExt.getEstimatedDeliveryTime(),
                shippingInfoExt.getSellerAverageRating());

        CategorySpecificInfoExt categorySpecificInfoExt = productsExt.getCateforySpecificInfo();
        SpecificationList[] specificationList = categorySpecificInfoExt.getSpecificationList();

        CategorySpecificInfo categorySpecificInfo = new CategorySpecificInfo(specificationList);


        return null;
    }
}