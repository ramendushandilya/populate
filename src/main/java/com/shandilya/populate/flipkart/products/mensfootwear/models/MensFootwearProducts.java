package com.shandilya.populate.flipkart.products.mensfootwear.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "mensfootwear")
public class MensFootwearProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public MensFootwearProducts() {
    }

    public MensFootwearProducts(BaseInfo baseInfo) {
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
