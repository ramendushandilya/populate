package com.shandilya.populate.flipkart.external.domains.airconditioner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {

    @JsonProperty("productBaseInfoV1")
    private BaseInfo baseInfo;

    @JsonProperty("productShippingInfoV1")
    private ShippingInfo shippingInfo;

    @JsonProperty("categorySpecificInfoV1")
    private CategorySpecificInfo cateforySpecificInfo;

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public CategorySpecificInfo getCateforySpecificInfo() {
        return cateforySpecificInfo;
    }

    public void setCateforySpecificInfo(CategorySpecificInfo cateforySpecificInfo) {
        this.cateforySpecificInfo = cateforySpecificInfo;
    }



    @Override
    public String toString() {
        return "Products{" +
                "baseInfo=" + baseInfo +
                ", shippingInfo=" + shippingInfo +
                ", cateforySpecificInfo=" + cateforySpecificInfo +
                '}';
    }
}
