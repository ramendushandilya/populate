package com.shandilya.populate.flipkart.products.camera.model;

import lombok.Builder;

import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:10 PM
 */
@Embeddable
@Builder
public class CameraBaseInfo {

    private String productId;
    private String ProductTitle;
    private CameraImageUrls cameraImageUrls;
    private String flipkartSellingPrice;
    private String productUrl;
    private String brand;
    private boolean inStock;
    private boolean codAvailable;
    private String[] offers;
    private String categoryPath;
    private CameraAttributes cameraAttributes;
}