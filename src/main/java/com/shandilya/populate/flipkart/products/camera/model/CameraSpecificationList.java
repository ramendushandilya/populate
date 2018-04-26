package com.shandilya.populate.flipkart.products.camera.model;

import lombok.Builder;

import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:51 PM
 */
@Embeddable
@Builder
public class CameraSpecificationList {

    private String key;
    private InnerValues[] innerValues;
}