package com.shandilya.populate.flipkart.products.furniture.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "furniture")
public class FurnitureProducts {

    @Id
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public FurnitureProducts() {
    }

    public FurnitureProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public FurnitureProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public FurnitureProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}