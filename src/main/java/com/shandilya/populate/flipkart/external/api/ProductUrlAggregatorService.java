package com.shandilya.populate.flipkart.external.api;

import java.util.List;

public interface ProductUrlAggregatorService {

    public List<String> getItemSetUrls(String seed);
}