package com.shandilya.populate.flipkart.products.microwaveovens.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "microwaveovens")
public class MicrowaveOvenProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public MicrowaveOvenProducts() {
    }

    public MicrowaveOvenProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }
}
