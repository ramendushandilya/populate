package com.shandilya.populate.flipkart.products.audioplayers.model;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 5/16/2018
 *         Time: 2:20 PM
 */
@Entity
public class AudioPlayerProducts {

    public AudioPlayerProducts() {
    }

    public AudioPlayerProducts(BaseInfo baseInfo) {
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

    public AudioPlayerProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public AudioPlayerProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}