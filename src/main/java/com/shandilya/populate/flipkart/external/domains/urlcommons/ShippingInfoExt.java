package com.shandilya.populate.flipkart.external.domains.urlcommons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingInfoExt {

    @JsonProperty("shippingChargesExt")
    private ShippingChargesExt shippingChargesExt;

    @JsonProperty("estimatedDeliveryTime")
    private String estimatedDeliveryTime;

    @JsonProperty("sellerName")
    private String sellerName;

    @JsonProperty("sellerAverageRating")
    private String sellerAverageRating;

    @JsonProperty("sellerNoOfRatings")
    private String sellerNoOfRatings;

    @JsonProperty("sellerNoOfReviews")
    private String sellerNoOfReviews;

    public ShippingChargesExt getShippingChargesExt() {
        return shippingChargesExt;
    }

    public void setShippingChargesExt(ShippingChargesExt shippingChargesExt) {
        this.shippingChargesExt = shippingChargesExt;
    }

    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAverageRating() {
        return sellerAverageRating;
    }

    public void setSellerAverageRating(String sellerAverageRating) {
        this.sellerAverageRating = sellerAverageRating;
    }

    public String getSellerNoOfRatings() {
        return sellerNoOfRatings;
    }

    public void setSellerNoOfRatings(String sellerNoOfRatings) {
        this.sellerNoOfRatings = sellerNoOfRatings;
    }

    public String getSellerNoOfReviews() {
        return sellerNoOfReviews;
    }

    public void setSellerNoOfReviews(String sellerNoOfReviews) {
        this.sellerNoOfReviews = sellerNoOfReviews;
    }

    @Override
    public String toString() {
        return "ShippingInfoExt{" +
                "shippingChargesExt=" + shippingChargesExt +
                ", estimatedDeliveryTime='" + estimatedDeliveryTime + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", sellerAverageRating='" + sellerAverageRating + '\'' +
                ", sellerNoOfRatings='" + sellerNoOfRatings + '\'' +
                ", sellerNoOfReviews='" + sellerNoOfReviews + '\'' +
                '}';
    }
}
