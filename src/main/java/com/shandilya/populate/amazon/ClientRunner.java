package com.shandilya.populate.amazon;


import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class ClientRunner {


    private static final String ACCESS_KEY_ID = "AKIAJU3XGZ3JCC5XJ4XQ";

    private static final String SECRET_KEY = "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";

    private static final String ENDPOINT = "webservices.amazon.in";

    public static void main(String[] args) {

        SignedRequestsHelper requestsHelper;

        try {
            requestsHelper = SignedRequestsHelper.getInstance(ENDPOINT, ACCESS_KEY_ID, SECRET_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String requestUrl = null;

        HashMap<String, String> params = new HashMap<String, String>();

        params.put("Service", "AWSECommerceService");
        params.put("Operation", "ItemSearch");
        params.put("AWSAccessKeyId", ACCESS_KEY_ID);
        params.put("AssociateTag", "viraltea-21");
        params.put("SearchIndex", "Books");
        params.put("Keywords", "Harry potter");
        params.put("ResponseGroup", "Images, ItemAttributes, Offers");
        params.put("ItemPage", "4");

        requestUrl = requestsHelper.sign(params);

        System.out.println("Signed url = "+requestUrl);
        String xml = null;

        try {
            URL url = new URL(requestUrl.toString());
            InputStream read = url.openStream();
            int ptr = 0;
            StringBuilder builder = new StringBuilder();
            while((ptr = read.read()) != -1) {
                builder.append((char) ptr);
            }
            xml = builder.toString();
            System.out.println("First");
            System.out.println(xml);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = XML.toJSONObject(xml);
        System.out.println(jsonObject);
    }
}