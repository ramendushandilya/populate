package com.shandilya.populate.flipkart.products.computerstorage.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Arrays;

@Embeddable
public class AcCategorySpecificInfo {

    public AcCategorySpecificInfo() {
    }

    @Column(length=1000)
    private String[] detailedSpecs;

    public AcCategorySpecificInfo(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    public String[] getDetailedSpecs() {
        return detailedSpecs;
    }

    public void setDetailedSpecs(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    @Override
    public String toString() {
        return "AcCategorySpecificInfo{" +
                "detailedSpecs=" + Arrays.toString(detailedSpecs) +
                '}';
    }
}
