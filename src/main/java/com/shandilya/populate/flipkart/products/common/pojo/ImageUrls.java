package com.shandilya.populate.flipkart.products.common.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:15 PM
 */
@Embeddable
public class ImageUrls {

    public ImageUrls() {
    }

    @Column(length = 1000000000)
    private String small;
    @Column(length = 1000000000)
    private String medium;
    @Column(length = 1000000000)
    private String large;

    public ImageUrls(String small, String medium, String large) {
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public String getSmall() {
        return small;
    }

    public ImageUrls setSmall(String small) {
        this.small = small;
        return this;
    }

    public String getMedium() {
        return medium;
    }

    public ImageUrls setMedium(String medium) {
        this.medium = medium;
        return this;
    }

    public String getLarge() {
        return large;
    }

    public ImageUrls setLarge(String large) {
        this.large = large;
        return this;
    }

    @Override
    public String toString() {
        return "ImageUrls{" +
                "small='" + small + '\'' +
                ", medium='" + medium + '\'' +
                ", large='" + large + '\'' +
                '}';
    }
}