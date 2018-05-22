package com.shandilya.populate.flipkart.products.sportsfitness.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "sportfitness")
public class SportFitnessProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public SportFitnessProducts() {
    }

    public SportFitnessProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public SportFitnessProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public SportFitnessProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}