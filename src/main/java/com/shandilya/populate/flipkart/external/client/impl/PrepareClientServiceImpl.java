package com.shandilya.populate.flipkart.external.client.impl;

import com.shandilya.populate.flipkart.external.client.PrepareClientService;
import com.shandilya.populate.flipkart.external.common.Constants;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class PrepareClientServiceImpl implements PrepareClientService {

    @Override
    public HttpHeaders prepareHeader() {

        HttpHeaders headers = new HttpHeaders();
        headers.add(Constants.AFFILIATE_ID_KEY.toString(), Constants.AFFILIATE_ID_VALUE.toString());
        headers.add(Constants.AFFILIATE_TOKEN_KEY.toString(), Constants.AFFILIATE_TOKEN_VALUE.toString());

        return headers;
    }
}
