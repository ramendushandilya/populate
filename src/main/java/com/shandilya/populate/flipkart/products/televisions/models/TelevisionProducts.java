package com.shandilya.populate.flipkart.products.televisions.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "television")
public class TelevisionProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public TelevisionProducts() {
    }

    public TelevisionProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public TelevisionProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public TelevisionProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}