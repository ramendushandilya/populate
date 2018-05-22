package com.shandilya.populate.flipkart.products.videoplayers.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author failedOptimus
 */

@Entity
@Table(name = "videoplayers")
public class VideoPlayersProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public VideoPlayersProducts() {
    }

    public VideoPlayersProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public VideoPlayersProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public VideoPlayersProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
}