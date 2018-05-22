package com.shandilya.populate.flipkart.products.washingmachine.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "WashingMachine")
public class WashingMachineProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public WashingMachineProducts() {
    }

    public WashingMachineProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public WashingMachineProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public WashingMachineProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}