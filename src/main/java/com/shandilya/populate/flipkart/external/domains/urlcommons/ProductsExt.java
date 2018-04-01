package com.shandilya.populate.flipkart.external.domains.urlcommons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsExt {

    @JsonProperty("productBaseInfoV1")
    private BaseInfoExt baseInfoExt;

    @JsonProperty("productShippingInfoV1")
    private ShippingInfoExt shippingInfoExt;

    @JsonProperty("categorySpecificInfoV1")
    private CategorySpecificInfoExt cateforySpecificInfo;

    public BaseInfoExt getBaseInfoExt() {
        return baseInfoExt;
    }

    public void setBaseInfoExt(BaseInfoExt baseInfoExt) {
        this.baseInfoExt = baseInfoExt;
    }

    public ShippingInfoExt getShippingInfoExt() {
        return shippingInfoExt;
    }

    public void setShippingInfoExt(ShippingInfoExt shippingInfoExt) {
        this.shippingInfoExt = shippingInfoExt;
    }

    public CategorySpecificInfoExt getCateforySpecificInfo() {
        return cateforySpecificInfo;
    }

    public void setCateforySpecificInfo(CategorySpecificInfoExt cateforySpecificInfo) {
        this.cateforySpecificInfo = cateforySpecificInfo;
    }

    @Override
    public String toString() {
        return "ProductsExt{" +
                "baseInfoExt=" + baseInfoExt +
                ", shippingInfoExt=" + shippingInfoExt +
                ", cateforySpecificInfo=" + cateforySpecificInfo +
                '}';
    }
}