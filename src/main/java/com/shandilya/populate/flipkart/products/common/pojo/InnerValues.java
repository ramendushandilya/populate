package com.shandilya.populate.flipkart.products.common.pojo;

import lombok.Builder;

import javax.persistence.Embeddable;
import java.util.Arrays;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:53 PM
 */
@Embeddable
public class InnerValues {

    public InnerValues() {
    }

    private String[] values;
    private String key;

    public InnerValues(String[] values, String key) {
        this.values = values;
        this.key = key;
    }

    public String[] getValues() {
        return values;
    }

    public InnerValues setValues(String[] values) {
        this.values = values;
        return this;
    }

    public String getKey() {
        return key;
    }

    public InnerValues setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String toString() {
        return "InnerValues{" +
                "values=" + Arrays.toString(values) +
                ", key='" + key + '\'' +
                '}';
    }
}