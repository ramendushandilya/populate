package com.shandilya.populate.flipkart.products.gaming.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "gaming")
public class GamingProducts {

    @Id
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public GamingProducts() {
    }

    public GamingProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public GamingProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public GamingProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}