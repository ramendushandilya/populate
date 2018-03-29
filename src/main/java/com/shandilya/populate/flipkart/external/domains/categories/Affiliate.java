package com.shandilya.populate.flipkart.external.domains.categories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Affiliate {

    @JsonProperty("apiListings")
    private Listings listings;

    public Listings getListings() {
        return listings;
    }

    public void setListings(Listings listings) {
        this.listings = listings;
    }

    @Override
    public String toString() {
        return "Affiliate{" +
                "listings=" + listings +
                '}';
    }
}
