package com.shandilya.populate.flipkart.external.domains.categories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Variants {

    @JsonProperty("v1.1.0")
    private Core core;

    public Core getCore() {
        return core;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    @Override
    public String toString() {
        return "Variants{" +
                "core=" + core +
                '}';
    }
}
