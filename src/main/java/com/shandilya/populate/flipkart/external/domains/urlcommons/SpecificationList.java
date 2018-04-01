package com.shandilya.populate.flipkart.external.domains.urlcommons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecificationList {

    @JsonProperty("values")
    private ValuesExt[] values;

    @JsonProperty("key")
    private String key;

    public ValuesExt[] getValues() {
        return values;
    }

    public void setValues(ValuesExt[] values) {
        this.values = values;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "SpecificationList{" +
                "values=" + Arrays.toString(values) +
                ", key='" + key + '\'' +
                '}';
    }
}
