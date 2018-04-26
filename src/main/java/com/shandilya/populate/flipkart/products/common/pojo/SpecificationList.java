package com.shandilya.populate.flipkart.products.common.pojo;

import javax.persistence.Embeddable;
import java.util.Arrays;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:51 PM
 */
@Embeddable
public class SpecificationList {

    public SpecificationList() {
    }

    private String key;
    private InnerValues[] innerValues;

    public SpecificationList(String key, InnerValues[] innerValues) {
        this.key = key;
        this.innerValues = innerValues;
    }

    public String getKey() {
        return key;
    }

    public SpecificationList setKey(String key) {
        this.key = key;
        return this;
    }

    public InnerValues[] getInnerValues() {
        return innerValues;
    }

    public SpecificationList setInnerValues(InnerValues[] innerValues) {
        this.innerValues = innerValues;
        return this;
    }

    @Override
    public String toString() {
        return "SpecificationList{" +
                "key='" + key + '\'' +
                ", innerValues=" + Arrays.toString(innerValues) +
                '}';
    }
}