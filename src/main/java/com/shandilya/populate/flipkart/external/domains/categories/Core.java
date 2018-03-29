package com.shandilya.populate.flipkart.external.domains.categories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Core {

    @JsonProperty("get")
    private String get;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    @Override
    public String toString() {
        return "Core{" +
                "get='" + get + '\'' +
                '}';
    }
}