package com.shandilya.populate.flipkart.products.airconditioners.model;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author rams0516
 *         Date: 5/16/2018
 *         Time: 1:45 PM
 */
public class AirconditionerProducts {

    public AirconditionerProducts() {
    }

    public AirconditionerProducts(BaseInfo baseInfo) {
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

    public AirconditionerProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public AirconditionerProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}