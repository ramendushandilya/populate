package com.shandilya.populate.flipkart.products.camera.model;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:08 PM
 */
@Entity
public class CameraProducts {

    public CameraProducts() { }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;
    //private ShippingInfo shippingInfo;
    //private CategorySpecificInfo categorySpecificInfo;

    public CameraProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public CameraProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public CameraProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}