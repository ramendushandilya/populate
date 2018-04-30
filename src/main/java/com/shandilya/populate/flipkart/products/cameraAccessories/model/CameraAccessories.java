package com.shandilya.populate.flipkart.products.cameraAccessories.model;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 12:37 PM
 */
@Entity
public class CameraAccessories {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;
    //private ShippingInfo shippingInfo;
    //private CategorySpecificInfo categorySpecificInfo;


    public CameraAccessories(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public CameraAccessories setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public CameraAccessories setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    @Override
    public String toString() {
        return "CameraAccessories{" +
                "id=" + id +
                ", baseInfo=" + baseInfo +
                '}';
    }
}