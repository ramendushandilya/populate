package com.shandilya.populate.flipkart.products.mensclothing.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "mensclothing")
public class MensClothingProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public MensClothingProducts() {
    }

    public MensClothingProducts(BaseInfo baseInfo) {
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
