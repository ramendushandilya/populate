package com.shandilya.populate.flipkart.external.domains.airconditioner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Master {

    @JsonProperty("nextUrl")
    private String nextUrl;

    @JsonProperty("validTill")
    private String validTill;

    @JsonProperty("lastProductId")
    private String lastProductId;

    @JsonProperty("products")
    private List<Products> products;

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public String getLastProductId() {
        return lastProductId;
    }

    public void setLastProductId(String lastProductId) {
        this.lastProductId = lastProductId;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "AirConditioners{" +
                "nextUrl='" + nextUrl + '\'' +
                ", validTill='" + validTill + '\'' +
                ", lastProductId='" + lastProductId + '\'' +
                ", products=" + products +
                '}';
    }
}
