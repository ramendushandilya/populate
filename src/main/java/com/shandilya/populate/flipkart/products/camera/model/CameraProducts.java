package com.shandilya.populate.flipkart.products.camera.model;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:08 PM
 */
@Entity
public class CameraProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private CameraBaseInfo cameraBaseInfo;
    private CameraShippingInfo cameraShippingInfo;
    private CameraCategorySpecificInfo cameraCategorySpecificInfo;


}