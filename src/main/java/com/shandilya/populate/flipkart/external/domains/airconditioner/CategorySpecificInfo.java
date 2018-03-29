package com.shandilya.populate.flipkart.external.domains.airconditioner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategorySpecificInfo {

    @JsonProperty("keySpecs")
    private String[] keySpecs;

    @JsonProperty("detailedSpecs")
    private String[] detailedSpecs;

    @JsonProperty("specificationList")
    private SpecificationList[] specificationList;

    public String[] getKeySpecs() {
        return keySpecs;
    }

    public void setKeySpecs(String[] keySpecs) {
        this.keySpecs = keySpecs;
    }

    public String[] getDetailedSpecs() {
        return detailedSpecs;
    }

    public void setDetailedSpecs(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    public SpecificationList[] getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(SpecificationList[] specificationList) {
        this.specificationList = specificationList;
    }

    @Override
    public String toString() {
        return "CategorySpecificInfo{" +
                "keySpecs=" + Arrays.toString(keySpecs) +
                ", detailedSpecs=" + Arrays.toString(detailedSpecs) +
                ", specificationList=" + Arrays.toString(specificationList) +
                '}';
    }
}