package com.shandilya.populate.flipkart.external.common;

public enum Constants {

    AFFILIATE_ID_KEY("Fk-Affiliate-Id"),
    AFFILIATE_ID_VALUE("ramendu98"),
    AFFILIATE_TOKEN_KEY("Fk-Affiliate-Token"),
    AFFILIATE_TOKEN_VALUE("acbfa63280704742bdcb1c3d30de0b9e"),

    SEED_URL("https://affiliate-api.flipkart.net/affiliate/api/ramendu98.json"),
    ;

    private final String text;

    Constants(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
