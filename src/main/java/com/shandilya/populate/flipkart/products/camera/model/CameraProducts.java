package com.shandilya.populate.flipkart.products.camera.model;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;
import com.shandilya.populate.flipkart.products.common.pojo.CategorySpecificInfo;
import com.shandilya.populate.flipkart.products.common.pojo.ShippingInfo;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:08 PM
 */
@Entity
public class CameraProducts {

    public CameraProducts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private BaseInfo baseInfoaseInfo;
    private ShippingInfo shippingInfohippingInfo;
    private CategorySpecificInfo categorySpecificInfo;

    public CameraProducts(BaseInfo baseInfoaseInfo, ShippingInfo shippingInfohippingInfo,
                          CategorySpecificInfo categorySpecificInfo) {
        this.baseInfoaseInfo = baseInfoaseInfo;
        this.shippingInfohippingInfo = shippingInfohippingInfo;
        this.categorySpecificInfo = categorySpecificInfo;
    }

    public Long getId() {
        return id;
    }

    public CameraProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfoaseInfo() {
        return baseInfoaseInfo;
    }

    public CameraProducts setBaseInfoaseInfo(BaseInfo baseInfoaseInfo) {
        this.baseInfoaseInfo = baseInfoaseInfo;
        return this;
    }

    public ShippingInfo getShippingInfohippingInfo() {
        return shippingInfohippingInfo;
    }

    public CameraProducts setShippingInfohippingInfo(ShippingInfo shippingInfohippingInfo) {
        this.shippingInfohippingInfo = shippingInfohippingInfo;
        return this;
    }

    public CategorySpecificInfo getCategorySpecificInfo() {
        return categorySpecificInfo;
    }

    public CameraProducts setCategorySpecificInfo(CategorySpecificInfo categorySpecificInfo) {
        this.categorySpecificInfo = categorySpecificInfo;
        return this;
    }

    @Override
    public String toString() {
        return "CameraProducts{" +
                "id=" + id +
                ", baseInfoaseInfo=" + baseInfoaseInfo +
                ", shippingInfohippingInfo=" + shippingInfohippingInfo +
                ", categorySpecificInfo=" + categorySpecificInfo +
                '}';
    }
}