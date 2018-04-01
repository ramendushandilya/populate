package com.shandilya.populate.flipkart.products.airconditioner.model;

import javax.persistence.*;

@Entity
public class AcProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private AcProductBaseInfo baseInfo;

    @Embedded
    private AcCategorySpecificInfo categorySpecificInfo;

    public AcProducts(AcProductBaseInfo baseInfo, AcCategorySpecificInfo categorySpecificInfo) {
        this.baseInfo = baseInfo;
        this.categorySpecificInfo = categorySpecificInfo;
    }

    public AcProductBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(AcProductBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public AcCategorySpecificInfo getCategorySpecificInfo() {
        return categorySpecificInfo;
    }

    public void setCategorySpecificInfo(AcCategorySpecificInfo categorySpecificInfo) {
        this.categorySpecificInfo = categorySpecificInfo;
    }

    @Override
    public String toString() {
        return "AcProducts{" +
                "baseInfo=" + baseInfo +
                ", categorySpecificInfo=" + categorySpecificInfo +
                '}';
    }
}