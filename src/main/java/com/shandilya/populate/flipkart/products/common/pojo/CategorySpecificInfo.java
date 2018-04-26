package com.shandilya.populate.flipkart.products.common.pojo;

import javax.persistence.Embeddable;
import java.util.Arrays;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:48 PM
 */
@Embeddable
public class CategorySpecificInfo {

    public CategorySpecificInfo() {
    }

    private SpecificationList[] specificationList;

    public CategorySpecificInfo(SpecificationList[] specificationList) {
        this.specificationList = specificationList;
    }

    public SpecificationList[] getSpecificationList() {
        return specificationList;
    }

    public CategorySpecificInfo setSpecificationList(SpecificationList[] specificationList) {
        this.specificationList = specificationList;
        return this;
    }

    @Override
    public String toString() {
        return "CategorySpecificInfo{" +
                "specificationList=" + Arrays.toString(specificationList) +
                '}';
    }
}