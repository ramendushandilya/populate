package com.shandilya.populate.flipkart.products.aircoolers.model;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 5/16/2018
 *         Time: 2:02 PM
 */
@Entity
@Table(name = "aircoolers")
public class AircoolerProducts {

    public AircoolerProducts() {
    }

    public AircoolerProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public Long getId() {
        return id;
    }

    public AircoolerProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public AircoolerProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}