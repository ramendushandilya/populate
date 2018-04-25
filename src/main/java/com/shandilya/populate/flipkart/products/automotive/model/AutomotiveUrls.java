package com.shandilya.populate.flipkart.products.automotive.model;

import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/25/2018
 *         Time: 3:41 PM
 */
@Embeddable
public class AutomotiveUrls {

    public AutomotiveUrls() {
    }

    private String small;
    private String medium;
    private String large;

    public AutomotiveUrls(String small, String medium, String large) {
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}