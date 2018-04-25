package com.shandilya.populate.flipkart.products.automotive.model;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 4/25/2018
 *         Time: 3:46 PM
 */
@Entity
public class AutomotiveProducts {

    public AutomotiveProducts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private AutomotiveCategorySpecificInfo automotiveCategorySpecificInfo;

    @Embedded
    private AutomotiveProductBaseInfo automotiveProductBaseInfo;

    public AutomotiveProducts(AutomotiveCategorySpecificInfo automotiveCategorySpecificInfo,
                              AutomotiveProductBaseInfo automotiveProductBaseInfo) {
        this.automotiveCategorySpecificInfo = automotiveCategorySpecificInfo;
        this.automotiveProductBaseInfo = automotiveProductBaseInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AutomotiveCategorySpecificInfo getAutomotiveCategorySpecificInfo() {
        return automotiveCategorySpecificInfo;
    }

    public void setAutomotiveCategorySpecificInfo(AutomotiveCategorySpecificInfo automotiveCategorySpecificInfo) {
        this.automotiveCategorySpecificInfo = automotiveCategorySpecificInfo;
    }

    public AutomotiveProductBaseInfo getAutomotiveProductBaseInfo() {
        return automotiveProductBaseInfo;
    }

    public void setAutomotiveProductBaseInfo(AutomotiveProductBaseInfo automotiveProductBaseInfo) {
        this.automotiveProductBaseInfo = automotiveProductBaseInfo;
    }
}