package com.shandilya.populate.flipkart.products.airconditioner.model;

import javax.persistence.*;

@Entity
public class AcProducts {

    public AcProducts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private AcProductBaseInfo baseInfo;

    @Embedded
    private AcCategorySpecificInfo categorySpecificInfo;

    public AcProducts(AcProductBaseInfo baseInfo, AcCategorySpecificInfo categorySpecificInfo) {
        this.baseInfo = baseInfo;
        this.categorySpecificInfo = categorySpecificInfo;
    }

    public Long getId() {
        return id;
    }

    public AcProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public AcProductBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public AcProducts setBaseInfo(AcProductBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public AcCategorySpecificInfo getCategorySpecificInfo() {
        return categorySpecificInfo;
    }

    public AcProducts setCategorySpecificInfo(AcCategorySpecificInfo categorySpecificInfo) {
        this.categorySpecificInfo = categorySpecificInfo;
        return this;
    }

    @Override
    public String toString() {
        return "AcProducts{" +
                "id=" + id +
                ", baseInfo=" + baseInfo +
                ", categorySpecificInfo=" + categorySpecificInfo +
                '}';
    }
}
