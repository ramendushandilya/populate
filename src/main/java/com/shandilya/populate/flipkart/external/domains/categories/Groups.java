package com.shandilya.populate.flipkart.external.domains.categories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Groups {

    @JsonProperty("affiliate")
    private Affiliate affiliate;

    public Affiliate getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "affiliate=" + affiliate +
                '}';
    }
}
