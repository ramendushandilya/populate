package com.shandilya.populate.flipkart.external.domains.airconditioner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Values {

    @JsonProperty("value")
    private String[] value;

    @JsonProperty("key")
    private String key;

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Values{" +
                "value=" + Arrays.toString(value) +
                ", key='" + key + '\'' +
                '}';
    }
}
