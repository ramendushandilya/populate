package com.shandilya.populate.flipkart.products.camera.model;

import lombok.Builder;

import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:40 PM
 */
@Embeddable
@Builder
public class CameraAttributes {

    private String size;
    private String color;
    private String storage;
    private String sizeUnit;
    private String displaySize;
}