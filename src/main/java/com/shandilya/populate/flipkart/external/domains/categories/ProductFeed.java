package com.shandilya.populate.flipkart.external.domains.categories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductFeed {

    @JsonProperty("apiGroups")
    private Groups group;

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "ProductFeed{" +
                "group=" + group +
                '}';
    }
}
