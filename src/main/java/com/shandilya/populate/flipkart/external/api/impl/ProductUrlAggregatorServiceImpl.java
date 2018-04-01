package com.shandilya.populate.flipkart.external.api.impl;

import com.shandilya.populate.flipkart.external.api.CategoryService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.client.PrepareClientService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.MasterExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class ProductUrlAggregatorServiceImpl implements ProductUrlAggregatorService {

    @Autowired
    private PrepareClientService clientService;

    @Autowired
    private CategoryService categoryService;

    public HttpEntity<String> createEntity() {
        HttpHeaders headers = clientService.prepareHeader();
        return new HttpEntity<>("parameters", headers);
    }

    /**
     * Returns the list of end point urls for a product category
     * This list could be iterated over to get list of products
     *
     * @param seed
     * @return
     */
    public List<String> getItemSetUrls(String seed) {
        List<String> nextUrls = new ArrayList<>();
        nextUrls.add(seed);
        //call helper to fetch all next urls excluding the seed
        helper(seed, nextUrls);
        return nextUrls;
    }

    /**
     * Helper method to recurse the api calls on a seed url
     * Generates all the URLs (nextUrls) for a product
     *
     * @param seedUrl
     * @param urls
     */
    public void helper(String seedUrl, List<String> urls) {

        if (seedUrl != null) {
            ResponseEntity<MasterExt> response = null;
            RestTemplate restTemplate = new RestTemplate();
            try {
                 response = restTemplate.exchange(seedUrl, HttpMethod.GET,
                        createEntity(), MasterExt.class);
            } catch (Exception e) {
                System.out.println("printing in exception");
                e.printStackTrace();
            }
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

    /**
     * Returns a generic list of products based on the categoryType passed
     * categoryType being passed determines the type of ProductsExt[] returned
     *
     * @param categoryType
     * @return
     */
    @Override
    public List<ProductsExt> getAllProducts(String categoryType) {
        String seed = null;
        Map<String, String> seedMap = categoryService.getProductCategoryUrls();
        List<ProductsExt> allProducts = new LinkedList<>();

        //If the category type exists, extract seed url from the map
        if (seedMap.containsKey(categoryType)) {
            seed = seedMap.get(categoryType);
        }
        List<String> urls = getItemSetUrls(seed.toString());
        RestTemplate template = new RestTemplate();
        ResponseEntity<MasterExt> masterResponseEntity;

        for (String url : urls) {
            masterResponseEntity = template.exchange(url, HttpMethod.GET,
                    createEntity(), MasterExt.class);
            if (masterResponseEntity.getBody().getNextUrl() != null) {
                allProducts.addAll(masterResponseEntity.getBody().getProducts());
            }
        }
        return allProducts;
    }
}