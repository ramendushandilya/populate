package com.shandilya.populate.flipkart.external.api.impl;

import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.client.PrepareClientService;
import com.shandilya.populate.flipkart.external.domains.airconditioner.Master;
import com.shandilya.populate.flipkart.external.domains.airconditioner.MasterTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductUrlAggregatorServiceImpl implements ProductUrlAggregatorService {

    @Autowired
    private PrepareClientService clientService;

    public HttpEntity<String> createEntity() {
        HttpHeaders headers = clientService.prepareHeader();
        return new HttpEntity<>("parameters", headers);
    }

    public List<String> getItemSetUrls(String seed) {
        List<String> nextUrls = new ArrayList<>();
        nextUrls.add(seed);
        helper(seed, nextUrls);
        return nextUrls;
    }

    public void helper(String seedUrl, List<String> urls) {

        if (seedUrl != null) {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Master> response = restTemplate.exchange(seedUrl, HttpMethod.GET,
                    createEntity(), Master.class);

            if (response.getStatusCodeValue() != 200) {
                System.out.println("Error");
            } else {
                String nextUrl = response.getBody().getNextUrl();
                if (nextUrl != null) {
                    urls.add(nextUrl);
                }
                helper(nextUrl, urls);
            }
        } else {
            return;
        }
    }
}