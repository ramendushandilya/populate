package com.shandilya.populate.flipkart.products.common.pojo;

import lombok.Builder;

import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:46 PM
 */
@Embeddable
public class ShippingInfo {

    public ShippingInfo() {
    }

    private String shippingAmount;
    private String estimatedDeliveryTime;
    private String sellerRating;

    public ShippingInfo(String shippingAmount, String estimatedDeliveryTime, String sellerRating) {
        this.shippingAmount = shippingAmount;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.sellerRating = sellerRating;
    }

    public String getShippingAmount() {
        return shippingAmount;
    }

    public ShippingInfo setShippingAmount(String shippingAmount) {
        this.shippingAmount = shippingAmount;
        return this;
    }

    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public ShippingInfo setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        return this;
    }

    public String getSellerRating() {
        return sellerRating;
    }

    public ShippingInfo setSellerRating(String sellerRating) {
        this.sellerRating = sellerRating;
        return this;
    }

    @Override
    public String toString() {
        return "ShippingInfo{" +
                "shippingAmount='" + shippingAmount + '\'' +
                ", estimatedDeliveryTime='" + estimatedDeliveryTime + '\'' +
                ", sellerRating='" + sellerRating + '\'' +
                '}';
    }
}