package com.shandilya.populate.flipkart.products.airconditioner.model;

import javax.persistence.Embeddable;
import java.util.Arrays;

@Embeddable
public class AcCategorySpecificInfo {

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
