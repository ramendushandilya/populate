package com.shandilya.populate.flipkart.products.automotive.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/25/2018
 *         Time: 3:42 PM
 */
@Embeddable
public class AutomotiveCategorySpecificInfo {

    public AutomotiveCategorySpecificInfo() {
    }

    @Column(length=1000)
    private String[] detailedSpecs;

    public AutomotiveCategorySpecificInfo(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    public String[] getDetailedSpecs() {
        return detailedSpecs;
    }

    public void setDetailedSpecs(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }
}